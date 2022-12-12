package com.jbond.app.tags;

public class TemperSensTag extends Tag {
    private int id;
    private int value;

    public TemperSensTag(byte name, byte[] byteValue) {
        super(name, byteValue);
        parse(byteValue);
    }

    @Override
    public void parse(byte[] byteArr) {
        id = (byteArr[0] & 0xFF);
        value = (byteArr[1] & 0xFF);
    }
}
