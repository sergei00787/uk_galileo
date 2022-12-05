package com.jbond.app.tags;

import com.jbond.app.ByteArr;

public class ShortTag implements Tag {
    private int val;

    /*
    public static void main(String[] args) throws Exception {
        ShortTag shortTag = new ShortTag();
        byte[] inp = ByteArr.fromString("FEFE");
        shortTag.parse(inp);
        System.out.println(shortTag.val);
    }
*/

    @Override
    public void parse(byte[] byteArr) {
        if (byteArr.length == 1 || byteArr.length == 2) {
            val = ByteArr.convertToInt32(byteArr);
        } /*else {
            GalileoPacket.logger.error("������ �������� ���� ShortTag, ������ ��������� ������� ������ 2 ����");
        }*/
    }
}
