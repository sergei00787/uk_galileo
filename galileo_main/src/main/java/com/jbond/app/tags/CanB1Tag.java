package com.jbond.app.tags;

import com.jbond.app.ByteArr;

public class CanB1Tag implements Tag {
    private byte[] bytes;

    @Override
    public void parse(byte[] byteArr) {
        byte[] reversedBytes = ByteArr.reverseBytes(byteArr);
        bytes = reversedBytes;

    }

    public byte[] getBytes() {
        return bytes;
    }

}
