package com.jbond.app.tags;

import com.jbond.app.ByteArr;

public class CanB0Tag extends Tag {
    private byte[] bytes;
    private int totalDistance;

    public CanB0Tag(byte name, byte[] byteValue) {
        super(name, byteValue);
        parse(byteValue);
    }

    @Override
    public void parse(byte[] byteArr) {
        byte[] reversedBytes = ByteArr.reverseBytes(byteArr);
        bytes = reversedBytes;
        totalDistance = ByteArr.convertToInt32(byteArr);
    }

    public byte[] getBytes() {
        return bytes;
    }

    public int getTotalDistance() {
        return totalDistance;
    }

}
