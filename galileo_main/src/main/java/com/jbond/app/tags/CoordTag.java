package com.jbond.app.tags;

import com.jbond.app.ByteArr;

import java.util.Arrays;

public class CoordTag implements Tag {
    private int nSat;
    private int isValid;
    private float longitude;
    private float latitude;

    /*
    public static void main(String[] args) throws Exception {
        CoordTag coordTag = new CoordTag();
        byte[] inp = ByteArr.fromString("07C00E3203B8D72D05");
        coordTag.parse(inp);
        System.out.println(coordTag.latitude);
        System.out.println(coordTag.longitude);
        System.out.println(coordTag.isValid);
        System.out.println(coordTag.nSat);
    }
    */

    @Override
    public void parse(byte[] byteArr) {
  /*      if (byteArr.length != 9) {
            GalileoPacket.logger.error("������ �������� ���� CoordTag, ������ ��������� ������� ������ 9 ����");
            return;
        }
*/

        byte flgByte = byteArr[0];
        byte[] latByte = Arrays.copyOfRange(byteArr, 1, 5);
        byte[] lonByte = Arrays.copyOfRange(byteArr, 5, 9);
        latitude = (float) (ByteArr.convertToInt32(latByte)) / 1000000;
        longitude = (float) (ByteArr.convertToInt32(lonByte)) / 1000000;
        nSat = (flgByte & 0xF);
        isValid = flgByte >> 4;

        /*"07C00E3203B8D72D05" =>
        ������������ ���������: 0 (���������� �����).
        ����� ���������: 7.
        ������: 53,612224.
        �������: 86,890424.
        */
    }

    public int getNumberOfSat() {
        return nSat;
    }

    public int getIsValid() {
        return isValid;
    }

    public float getLongitude() {
        return longitude;
    }

    public float getLatitude() {
        return latitude;
    }
}
