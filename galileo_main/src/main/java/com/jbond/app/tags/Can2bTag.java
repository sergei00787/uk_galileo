package com.jbond.app.tags;

public class Can2bTag implements Tag{
    private byte val1b;
    private byte val2b;

    @Override
    public void parse(byte[] byteArr) {
        val2b = byteArr[0];
        val1b = byteArr[1];
    }

    public byte getVal1b() {
        return val1b;
    }

    public byte getVal2b() {
        return val2b;
    }
}
