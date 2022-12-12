package com.jbond.app.tags;

import com.jbond.app.ByteArr;

import java.io.IOException;

public class StringTag extends Tag {
    private String val;

    public StringTag(byte name, byte[] byteValue) {
        super(name, byteValue);
        parse(byteValue);
    }

    @Override
    public void parse(byte[] byteArr) {

        try {
            val = ByteArr.toString(byteArr);
        } catch (IOException e) {
            e.printStackTrace();
            //GalileoPacket.logger.error("������ ������ ������� ����, �������� ������ - " + ByteArr.toHEXString(byteArr));
        }
    }

    public String getVal() {
        return val;
    }


}
