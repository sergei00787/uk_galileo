package com.jbond.app.tags;

import com.jbond.app.ByteArr;

public class CanA0Tag extends Tag {
    private byte[] bytes;
    private int totalFuel;

    public CanA0Tag(byte name, byte[] byteValue) {
        super(name, byteValue);
        parse(byteValue);
    }


    @Override
    public void parse(byte[] byteArr) {
        byte[] reversedBytes = ByteArr.reverseBytes(byteArr);
        bytes = reversedBytes;
        totalFuel = ByteArr.convertToInt32(byteArr);
    }

    public int getTotalFuel() {
        return totalFuel;
    }

    public byte[] getBytes() {
        return bytes;
    }

}
