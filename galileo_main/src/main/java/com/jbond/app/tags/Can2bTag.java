package com.jbond.app.tags;

public class Can2bTag extends Tag {
    private byte val1b;
    private byte val2b;

    public Can2bTag(byte name, byte[] byteValue) {
        super(name, byteValue);
        parse(byteValue);
    }

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
