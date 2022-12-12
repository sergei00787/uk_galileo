package com.jbond.app.tags;

import com.jbond.app.ByteArr;

import java.util.Arrays;

public class CoordTag extends Tag {
    private int nSat;
    private int isValid;
    private float longitude;
    private float latitude;

    public CoordTag(byte name, byte[] byteValue) {
        super(name, byteValue);
        parse(byteValue);
    }

    @Override
    public void parse(byte[] byteArr) {
        byte flgByte = byteArr[0];
        byte[] latByte = Arrays.copyOfRange(byteArr, 1, 5);
        byte[] lonByte = Arrays.copyOfRange(byteArr, 5, 9);
        latitude = (float) (ByteArr.convertToInt32(latByte)) / 1000000;
        longitude = (float) (ByteArr.convertToInt32(lonByte)) / 1000000;
        nSat = (flgByte & 0xF);
        isValid = flgByte >> 4;
    }

    public int getNumberOfSat() {
        return nSat;
    }

    public int getIsValid() {
        return isValid;
    }

    public float getLongitude() {
        return longitude;
    }

    public float getLatitude() {
        return latitude;
    }
}
