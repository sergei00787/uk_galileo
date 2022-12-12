package com.jbond.app.tags;

public class Can4bTag extends Tag {
    private byte val1b;
    private byte val2b;
    private byte val3b;
    private byte val4b;

    public Can4bTag(byte name, byte[] byteValue) {
        super(name, byteValue);
        parse(byteValue);
    }

    @Override
    public void parse(byte[] byteArr) {
        val4b = byteArr[0];
        val3b = byteArr[1];
        val2b = byteArr[2];
        val1b = byteArr[3];
    }

    public byte getVal1b() {
        return val1b;
    }

    public byte getVal2b() {
        return val2b;
    }

    public byte getVal3b() {
        return val3b;
    }
}
