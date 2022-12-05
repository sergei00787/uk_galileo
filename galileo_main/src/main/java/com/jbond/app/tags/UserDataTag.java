package com.jbond.app.tags;

import com.jbond.app.ByteArr;

import java.util.Arrays;

public class UserDataTag implements Tag {
    private int length;
    private byte[] data;

    @Override
    public void parse(byte[] byteArr) {
        length = (byteArr[0] & 0xFF);
        byte[] revercedBytes = ByteArr.reverseBytes(byteArr);
        data = Arrays.copyOfRange(revercedBytes,0, length );
    }

    /*
    public static void main(String[] args) throws Exception {
        UserDataTag userDataTag = new UserDataTag();
        byte[] inp = ByteArr.fromString("050102030405");
        userDataTag.parse(inp);
        System.out.println(userDataTag.length);
        System.out.println(ByteArr.toHEXString(userDataTag.data));
    }
*/
}
