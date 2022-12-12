package com.jbond.app.tags;

import com.jbond.app.ByteArr;

public class UintTag extends Tag {
    private int val;

    public UintTag(byte name, byte[] byteValue) {
        super(name, byteValue);
        parse(byteValue);
    }

    @Override
    public void parse(byte[] byteArr) {
        int size = byteArr.length;
        switch (size) {
            case 1:
            case 2:
            case 4:
                val = ByteArr.convertToInt32(byteArr);
                break;
            //default:
            //GalileoPacket.logger.error("������ � �������� ���� UintTag, �������� ������:" + ByteArr.toHEXString(byteArr));
        }
    }

    public int getVal() {
        return val;
    }
}
