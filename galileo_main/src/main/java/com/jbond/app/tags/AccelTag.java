package com.jbond.app.tags;

public class AccelTag extends Tag {
    private short accelX;
    private short accelY;
    private short accelZ;

    public AccelTag(byte name, byte[] byteValue) {
        super(name, byteValue);
        parse(byteValue);
    }

    @Override
    public void parse(byte[] byteArr) {
        accelX = (short) (((byteArr[1] & 0b00000011) << 8) | ((byteArr[0] & 0b11111111) >> 0));
        accelY = (short) (((byteArr[2] & 0b00001111) << 6) | ((byteArr[1] & 0b11111100) >> 2));
        accelZ = (short) (((byteArr[3] & 0b00111111) << 4) | ((byteArr[2] & 0b11110000) >> 4));
    }

    public short getAccelX() {
        return accelX;
    }

    public short getAccelY() {
        return accelY;
    }

    public short getAccelZ() {
        return accelZ;
    }
}
