package com.jbond.app;

import java.util.Arrays;

public class GalileoPacket {
    //public static Logger logger = LoggerFactory.getLogger(GalileoPacket.class);

    private byte header;
    private int length;
    private byte[] tagsData;
    private String crc16;

    public GalileoPacket(byte header, int length, byte[] tagsData, String crc16) {
        this.header = header;
        this.length = length;
        this.tagsData = tagsData;
        this.crc16 = crc16;
    }

    public GalileoPacket(byte[] byteArr) {
        this.header = getHeaderFromBytes(byteArr);
        this.length = getLengthFromBytes(byteArr);
        this.tagsData = getTagsDataFromBytes(byteArr);
        this.crc16 = getCrcFromBytes(byteArr);
    }

    public String getCrc16() {
        return crc16;
    }


    public byte getHeader() {
        return header;
    }

    public int getLength() {
        return length;
    }


    private byte[] getTagsDataFromBytes(byte[] byteArr) {
        return Arrays.copyOfRange(byteArr, 0, byteArr.length - 2);
    }


    private byte getHeaderFromBytes(byte[] byteArr){
        return byteArr[0];
    }

    private int getLengthFromBytes(byte[] byteArr){
        byte[] headerByte = Arrays.copyOfRange(byteArr, 1,3);
        int intHeader = ((headerByte[1] & 0xFF) << 8)|((headerByte[0] & 0x7F) << 0);
        return intHeader;
    }


    public static boolean isValid(byte[] pkgbody) throws Exception {
        String crc16 = getCrcFromBytes(pkgbody);
        String crc16Calculated = calculateCrc16PackageBody(pkgbody);
        if (crc16Calculated.equals(crc16)){
            return true;
        }
        return false;
    }

    public static String calculateCrc16PackageBody(byte[] pkgbody) throws Exception {
        byte[] tagsData = Arrays.copyOfRange(pkgbody, 0,pkgbody.length - 2);
        return Crc16.getCRC(tagsData);
    }

    public static String getCrcFromBytes(byte[] pkg){
        byte[] crc16Byte = Arrays.copyOfRange(pkg,pkg.length-2, pkg.length);
        return ByteArr.toHEXString(crc16Byte);
    }

    public byte[] getTagsData() {
        return tagsData;
    }
}
