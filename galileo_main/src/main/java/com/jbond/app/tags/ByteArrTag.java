package com.jbond.app.tags;

public class ByteArrTag extends Tag {
    private byte[] val;

    public ByteArrTag(byte name, byte[] byteValue) {
        super(name, byteValue);
        parse(byteValue);
    }

    @Override
    public void parse(byte[] byteArr) {
        val = byteArr;
    }

    public byte[] getVal() {
        return val;
    }
}
