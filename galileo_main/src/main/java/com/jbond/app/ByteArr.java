package com.jbond.app;

import org.apache.commons.io.IOUtils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class ByteArr {
    public static String toHEXString(byte[] b) {
        String ret = "";
        for (int i = 0; i < b.length; i++) {
            String hex = Integer.toHexString(b[i] & 0xFF);
            if (hex.length() == 1) {
                hex = '0' + hex;
            }
            ret += hex.toUpperCase();
        }
        return ret;
    }


    public static String toString(byte[] b) throws IOException {
        InputStream inputStream = new ByteArrayInputStream(b);
        return IOUtils.toString(inputStream, StandardCharsets.UTF_8.name());
    }


    public static byte[] fromString(String hex) throws Exception {
        if (hex.length() % 2 != 0) {
            throw new Exception("�������� Hex ������");
        }
        byte[] result = new byte[hex.length() / 2];
        for (int i = 0; i < hex.length() / 2; i++) {
            Integer curInt = Integer.parseInt(hex.substring(i * 2, i * 2 + 2), 16);
            result[i] = curInt.byteValue();
        }
        return result;
    }

    public static Byte[] getArrBytefromString(String hex) throws Exception {
        if (hex.length() % 2 != 0) {
            throw new Exception("�������� Hex ������");
        }
        Byte[] result = new Byte[hex.length() / 2];
        for (int i = 0; i < hex.length() / 2; i++) {
            Integer curInt = Integer.parseInt(hex.substring(i * 2, i * 2 + 2), 16);
            result[i] = curInt.byteValue();
        }
        return result;
    }


    public static int convertToInt32(byte[] bytes) {
        int result;
        switch (bytes.length) {
            case 4:
                result = ((bytes[3] & 0xFF) << 24) | ((bytes[2] & 0xFF) << 16) | ((bytes[1] & 0xFF) << 8) | ((bytes[0] & 0xFF) << 0);
                break;
            case 2:
                result = ((bytes[1] & 0xFF) << 8) | ((bytes[0] & 0xFF) << 0);
                break;
            case 1:
                result = (bytes[0] & 0xFF);
                break;
            default:
                result = 0;
        }

        return result;
    }

    public static byte[] reverseBytes(byte[] inpBytes) {
        byte[] reversedBytes = new byte[inpBytes.length];

        for (int i = 0; i < inpBytes.length; i++) {
            reversedBytes[i] = inpBytes[inpBytes.length - 1 - i];
        }
        return reversedBytes;
    }


/*
    public static int convertToShort(byte[] bytes) {
        return ((bytes[1] & 0xFF) << 8) |
                ((bytes[0] & 0xFF) << 0);
    }
*/
}

