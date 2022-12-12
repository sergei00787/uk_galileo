package com.jbond.app.pkgdataextractor;

import com.jbond.app.galileo.storage.entities.GalileoPackage;
import com.jbond.app.tags.GalileoRowTags;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class PkgDataExtractorService implements Runnable {
    public BlockingQueue<GalileoPackage> queue;

    public PkgDataExtractorService(BlockingQueue<GalileoPackage> queue) {
        this.queue = queue;
    }

    public static void main(String[] args) {
        BlockingQueue<GalileoPackage> queue = new ArrayBlockingQueue(100);

        PkgDatabaseReader pkgDatabaseReader = new PkgDatabaseReader(queue);
        Thread pkgDatabaseReaderThread = new Thread(pkgDatabaseReader);
        pkgDatabaseReaderThread.start();

        for (int i = 0; i < 5; i++) {
            PkgDataExtractorService pkgDataExtractorService = new PkgDataExtractorService(queue);
            Thread pkgDataExtractorServiceThread = new Thread(pkgDataExtractorService);
            pkgDataExtractorServiceThread.start();
        }
    }


    @Override
    public void run() {
        while (true) {
            GalileoPackage pkg = queue.poll();
            if (pkg == null) continue;
            List<GalileoRowTags> list = PkgParser.ParsePkg(pkg.getPackageData());
            for (GalileoRowTags rowTags : list) {
                System.out.println(list.get(0).toString());
                System.out.println(list.get(1).toString());
                System.out.println(list.get(2).toString());
                System.out.println(list.get(3).toString());
                System.out.println(list.get(4).toString());
            }
        }
    }
}
