package com.jbond.app.tags;

public class BitsTag extends Tag {
    private String val;

    public BitsTag(byte name, byte[] byteValue) {
        super(name, byteValue);
        parse(byteValue);
    }

    @Override
    public void parse(byte[] byteArr) {
        switch (byteArr.length) {
            case 1:
                val = Integer.toBinaryString(Byte.toUnsignedInt(byteArr[0]));
                break;
            case 2:
                val = Integer.toBinaryString(Byte.toUnsignedInt(byteArr[1])) + Integer.toBinaryString(Byte.toUnsignedInt(byteArr[0]));
                break;
            //default:
            //  GalileoPacket.logger.error("������ �������� ���� BitsTag, ������ ��������� ������� ������ 2 ����");
        }
    }

    public boolean getValueByIndex(int indexBit) {
        if (indexBit > this.val.length()) return false;

        return this.val.charAt(indexBit) == '1';
    }

/*
    public static void main(String[] args) throws Exception {
        BitsTag bitsTag = new BitsTag();
        byte[] inp = ByteArr.fromString("FFFE");
        bitsTag.parse(inp);
        System.out.println(bitsTag.val);
        System.out.println(bitsTag.getValueByIndex(7));
    }
*/


}
