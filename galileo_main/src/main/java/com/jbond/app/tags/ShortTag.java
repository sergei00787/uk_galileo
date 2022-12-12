package com.jbond.app.tags;

import com.jbond.app.ByteArr;

public class ShortTag extends Tag {
    private int val;

    public ShortTag(byte name, byte[] byteValue) {
        super(name, byteValue);
        parse(byteValue);
    }


    @Override
    public void parse(byte[] byteArr) {
        if (byteArr.length == 1 || byteArr.length == 2) {
            val = ByteArr.convertToInt32(byteArr);
        }
    }
}
