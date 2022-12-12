package com.jbond.app.pkgdataextractor;

import com.jbond.app.galileo.storage.entities.GalileoIncomingPackageService;
import com.jbond.app.galileo.storage.entities.GalileoPackage;

import java.util.List;
import java.util.concurrent.BlockingQueue;

public class PkgDatabaseReader implements Runnable{
    private BlockingQueue<GalileoPackage> queue;
    public PkgDatabaseReader(BlockingQueue<GalileoPackage> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                GalileoIncomingPackageService incomingPackageService = new GalileoIncomingPackageService();
                List<GalileoPackage> galileoPackageList = incomingPackageService.selectGalileoPkg(10);
                for (GalileoPackage galileoPkg: galileoPackageList) {
                    if (queue.contains(galileoPkg)) {
                        System.out.println("BREAKE OFFER");
                        break;
                    } else {
                        System.out.println("QUEUE OFFER - " + galileoPkg.toString());
                        queue.offer(galileoPkg);
                    }
                }
                Thread.sleep(100);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
