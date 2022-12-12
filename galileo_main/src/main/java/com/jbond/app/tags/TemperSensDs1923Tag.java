package com.jbond.app.tags;

public class TemperSensDs1923Tag extends Tag {
    private int id;
    private int value;
    private float humidity;

    public TemperSensDs1923Tag(byte name, byte[] byteValue) {
        super(name, byteValue);
        parse(byteValue);
    }

    @Override
    public void parse(byte[] byteArr) {
        id = (byteArr[0] & 0xFF);
        value = (byteArr[1] & 0xFF);
        humidity = ((float) (byteArr[2] & 0xFF)) * 100 / 255;
    }

}
