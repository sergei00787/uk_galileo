package com.jbond.app.tags;

public class ByteArrTag implements Tag{
    private byte[] val;

    @Override
    public void parse(byte[] byteArr) {
        val = byteArr;
    }

    public byte[] getVal() {
        return val;
    }
}
