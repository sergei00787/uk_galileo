package com.jbond.app.pkgdataextractor;

import com.jbond.app.GalileoTagExtTable;
import com.jbond.app.GalileoTagTable;
import com.jbond.app.galileo.storage.entities.GalileoPackage;
import com.jbond.app.tags.GalileoRowTags;
import com.jbond.app.tags.Tag;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class PkgParser implements Runnable{
    BlockingQueue<GalileoPackage> queue;
    private static final GalileoTagTable galileoTagTable = new GalileoTagTable();
    private static final GalileoTagExtTable galileoTagExtTable  = new GalileoTagExtTable();
    public PkgParser(BlockingQueue<GalileoPackage> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                GalileoPackage galileoPackage = queue.poll(50, TimeUnit.MILLISECONDS);
                galileoPackage.getPackageData();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static List<GalileoRowTags> ParsePkg(byte[] pkgData) {
        List<GalileoRowTags> galileoRowTagsList = new ArrayList<>();
        int indx = 0;
        byte prevByteTag = 0;
        GalileoRowTags currentRow = null;
        while (indx < pkgData.length) {
            int lengthCurrentTag = 0;
            if (prevByteTag == 0 || prevByteTag < pkgData[indx]) {
                currentRow = new GalileoRowTags();
                galileoRowTagsList.add(currentRow);
            }
            if (pkgData[indx] < 0xFE) {
                lengthCurrentTag = galileoTagTable.getTagDescr(pkgData[indx]).getLen();
                if (lengthCurrentTag == -1) {
                    lengthCurrentTag = (pkgData[indx+1] & 0xFF);
                    indx++;
                }
                Tag curTag = Tag.createTag(galileoTagTable.getTagDescr(
                        pkgData[indx]).getType(),
                        pkgData[indx],
                        Arrays.copyOfRange(pkgData, indx+1, indx + lengthCurrentTag));

                currentRow.addTagToRow(curTag);
                indx = indx + lengthCurrentTag + 1;
            } else {
                lengthCurrentTag = galileoTagExtTable.getTagDescr(pkgData[indx]).getLen();
                if (lengthCurrentTag == -1) {
                    lengthCurrentTag = (pkgData[indx+1] & 0xFF);
                    indx++;
                }
                Tag curTag = Tag.createTag(galileoTagTable.getTagDescr(
                                pkgData[indx]).getType(),
                        pkgData[indx],
                        Arrays.copyOfRange(pkgData, indx+1, indx + lengthCurrentTag));

                currentRow.addTagToRow(curTag);
                indx = indx + lengthCurrentTag + 1;
            }
        }
        return galileoRowTagsList;
    }
}
