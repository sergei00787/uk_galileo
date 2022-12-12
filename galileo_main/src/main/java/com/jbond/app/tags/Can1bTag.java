package com.jbond.app.tags;

public class Can1bTag extends Tag {
    private byte val;

    public Can1bTag(byte name, byte[] byteValue) {
        super(name, byteValue);
        parse(byteValue);
    }

    @Override
    public void parse(byte[] byteArr) {
        val = byteArr[0];
    }

    public byte getVal() {
        return val;
    }
}
