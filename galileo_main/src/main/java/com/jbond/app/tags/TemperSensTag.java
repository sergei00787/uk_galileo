package com.jbond.app.tags;

import com.jbond.app.ByteArr;

public class TemperSensTag implements Tag{
    private int id;
    private int value;

    @Override
    public void parse(byte[] byteArr) {
        id = (byteArr[0] & 0xFF);
        value = (byteArr[1] & 0xFF);
    }

    public static void main(String[] args) throws Exception {
        TemperSensTag temperSensTag = new TemperSensTag();
        byte[] inp = ByteArr.fromString("1AFE");
        temperSensTag.parse(inp);
        System.out.println(temperSensTag.id);
        System.out.println(temperSensTag.value);
    }
}
