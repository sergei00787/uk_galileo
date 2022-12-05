package com.jbond.app.tags;

import com.jbond.app.ByteArr;
import java.util.Arrays;

public class CanA1Tag implements Tag {
    private byte[] bytes;
    private int fuelLevelPersent;
    private int tempCoolingLiquid;
    private int engRpm;

    @Override
    public void parse(byte[] byteArr) {
        byte[] reversedBytes = ByteArr.reverseBytes(byteArr);
        bytes = reversedBytes;
        fuelLevelPersent = (int) ((byteArr[0] & 0xFF) * 0.4);
        tempCoolingLiquid =  (byteArr[1] & 0xFF) - 40;
        engRpm = (int) (ByteArr.convertToInt32(Arrays.copyOfRange(byteArr,2,4)) * 0.125);
    }

    public byte[] getBytes() {
        return bytes;
    }

    public int getFuelLevelPersent() {
        return fuelLevelPersent;
    }

    public int getTempCoolingLiquid() {
        return tempCoolingLiquid;
    }

    public int getEngRpm() {
        return engRpm;
    }

/*
    public static void main(String[] args) throws Exception {
        CanA1Tag canA1Tag = new CanA1Tag();
        byte[] inp = ByteArr.fromString("FA725025");
        canA1Tag.parse(inp);
        System.out.println(canA1Tag.fuelLevelPersent);
        System.out.println(canA1Tag.tempCoolingLiquid);
        System.out.println(canA1Tag.engRpm);
        System.out.println( ByteArr.toHEXString(canA1Tag.bytes));
    }
*/

}
