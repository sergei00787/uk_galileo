package com.jbond.app.tags;

import com.jbond.app.ByteArr;

import java.time.LocalDateTime;

public class TimeTag implements Tag {
    private LocalDateTime value;

    @Override
    public void parse(byte[] byteArr) {
        long seconds = ByteArr.convertToInt32(byteArr);
        System.out.println("seconds"+seconds);
        LocalDateTime date = LocalDateTime.of(1970,01,01,00,00,00);
        value = date.plusSeconds(seconds);
    }

    public LocalDateTime getValue() {
        return value;
    }

    /*
    public static void main(String[] args) throws Exception {
        TimeTag timeTag = new TimeTag();
        byte[] inp = ByteArr.fromString("FF");
        timeTag.parse(inp);
        System.out.println(timeTag.value);
    }
    */
}
