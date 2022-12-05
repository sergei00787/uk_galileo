package com.jbond.app.tags;

import com.jbond.app.ByteArr;

public class TemperSensDs1923Tag implements Tag{
    private int id;
    private int value;
    private float humidity;

    @Override
    public void parse(byte[] byteArr) {
        id = (byteArr[0] & 0xFF);
        value = (byteArr[1] & 0xFF);
        humidity = ((float) (byteArr[2] & 0xFF)) * 100 / 255;
    }

    /*
    public static void main(String[] args) throws Exception {
        TemperSensDs1923Tag temperSensTag = new TemperSensDs1923Tag();
        byte[] inp = ByteArr.fromString("011020");
        temperSensTag.parse(inp);
        System.out.println(temperSensTag.id);
        System.out.println(temperSensTag.value);
        System.out.println(temperSensTag.humidity);
    }
*/
}
