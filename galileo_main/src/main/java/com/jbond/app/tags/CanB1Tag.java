package com.jbond.app.tags;

import com.jbond.app.ByteArr;

public class CanB1Tag extends Tag {
    private byte[] bytes;

    public CanB1Tag(byte name, byte[] byteValue) {
        super(name, byteValue);
        parse(byteValue);
    }

    @Override
    public void parse(byte[] byteArr) {
        byte[] reversedBytes = ByteArr.reverseBytes(byteArr);
        bytes = reversedBytes;

    }

    public byte[] getBytes() {
        return bytes;
    }

}
