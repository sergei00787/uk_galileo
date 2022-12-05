package com.jbond.app.tags;

import com.jbond.app.ByteArr;

import java.io.IOException;

public class StringTag implements Tag {
    private String val;

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

    /*
    public static void main(String[] args) throws Exception {
        StringTag stringTag = new StringTag();
        String str = "String Tag FOREVER";
        byte[] inp = str.getBytes();
//        byte[] inp = ByteArr.fromString("FF4567FE5776");
        stringTag.parse(inp);
        System.out.println(stringTag.val);
    }
    */
}
