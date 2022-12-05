package com.jbond.app.tags;

public class Can1bTag implements Tag{
    private byte val;

    @Override
    public void parse(byte[] byteArr) {
        val = byteArr[0];
    }

    public byte getVal() {
        return val;
    }
}
