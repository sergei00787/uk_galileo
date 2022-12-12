package com.jbond.app.tags;

import java.util.Arrays;

public abstract class Tag {
    private final byte name;
    private final byte[] byteValue;

    public Tag(byte name, byte[] byteValue) {
        this.name = name;
        this.byteValue = byteValue;
    }

    public static Tag createTag(String tagType, byte nameTag, byte[] byteValue) {
        Tag tag = null;
        switch (tagType.toLowerCase()) {
            case "uint":
                tag = new UintTag(nameTag, byteValue);
                break;
            case "string":
                tag = new StringTag(nameTag, byteValue);
                break;
            case "time":
                tag = new TimeTag(nameTag, byteValue);
                break;
            case "coord":
                tag = new CoordTag(nameTag, byteValue);
                break;
            case "speed":
                tag = new TimeTag(nameTag, byteValue);
                break;
            case "accel":
                tag = new AccelTag(nameTag, byteValue);
                break;
            case "bitstring":
                tag = new BitsTag(nameTag, byteValue);
                break;
            case "bytearr":
                tag = new ByteArrTag(nameTag, byteValue);
                break;
            case "dut2b":
                tag = new FuelSensTag(nameTag, byteValue);
                break;
            case "dut3b":
                tag = new FuelSensTag(nameTag, byteValue);
                break;
            case "tempsens":
                tag = new TemperSensTag(nameTag, byteValue);
                break;
            case "ds1923":
                tag = new TemperSensDs1923Tag(nameTag, byteValue);
                break;
            case "can1b":
                tag = new Can1bTag(nameTag, byteValue);
                break;
            case "can2b":
                tag = new Can2bTag(nameTag, byteValue);
                break;
            case "can4b":
                tag = new Can4bTag(nameTag, byteValue);
                break;
            case "can_a0":
                tag = new CanA0Tag(nameTag, byteValue);
                break;
            case "can_a1":
                tag = new CanA1Tag(nameTag, byteValue);
                break;
            case "can_b0":
                tag = new CanB0Tag(nameTag, byteValue);
                break;
            case "can_b1":
                tag = new CanB1Tag(nameTag, byteValue);
                break;
        }
        return tag;
    }

    public abstract void parse(byte[] byteArr);

    public byte getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "name=" + name +
                ", byteValue=" + Arrays.toString(byteValue) +
                '}';
    }
}
