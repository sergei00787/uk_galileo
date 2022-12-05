package com.jbond.app.tags;


import com.jbond.app.ByteArr;

import java.util.Arrays;

public class FuelSensTag implements Tag{
    private int level;
    private int temperature;

    @Override
    public void parse(byte[] byteArr) {
        switch (byteArr.length){
            case 2:
                level = ByteArr.convertToInt32(byteArr);
                temperature = 0;
                break;
            case 3:
                level = ByteArr.convertToInt32(Arrays.copyOfRange(byteArr,0,2));
                temperature = byteArr[2] & 0xFF;
                break;
            //default:
              //  GalileoPacket.logger.error("������ �������� ���� FuelSensTag, ������ ��������� ������� ������ �� ����� 2 ��� 3 ����");
        }
    }

    /*
    public static void main(String[] args) throws Exception {
        FuelSensTag fuelSensTag = new FuelSensTag();
        byte[] testInp = ByteArr.fromString("FF0F23");
        fuelSensTag.parse(testInp);
        System.out.println(fuelSensTag.level);
        System.out.println(fuelSensTag.temperature);
    }
    */
}
