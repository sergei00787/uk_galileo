package com.jbond.app.tags;


import com.jbond.app.ByteArr;

import java.util.Arrays;

public class SpeedTag implements Tag {
    private float speed;
    private int course;

    @Override
    public void parse(byte[] byteArr) {
        if (byteArr.length != 4) {
           // GalileoPacket.logger.error("������ �������� ���� SpeedTag, ������ ��������� ������� " +
             //       "�� ����� 4 ����. �������� ������ - " + byteArr.toString());
            return;
        }
        speed = (float) (ByteArr.convertToInt32(Arrays.copyOfRange(byteArr, 0, 2))) / 10;
        course = ByteArr.convertToInt32(Arrays.copyOfRange(byteArr, 2, 4)) / 10;
    }

    public float getSpeed() {
        return speed;
    }

    public int getCourse() {
        return course;
    }

    /*
    public static void main(String[] args) throws Exception {
        SpeedTag speedTag = new SpeedTag();
        byte[] inp = ByteArr.fromString("5C004808");
        speedTag.parse(inp);
        System.out.println(speedTag.speed);
        System.out.println(speedTag.course);
    }
    */
}
