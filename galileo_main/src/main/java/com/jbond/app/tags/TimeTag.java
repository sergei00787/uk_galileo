package com.jbond.app.tags;

import com.jbond.app.ByteArr;

import java.time.LocalDateTime;

public class TimeTag extends Tag {
    private LocalDateTime value;

    public TimeTag(byte name, byte[] byteValue) {
        super(name, byteValue);
        parse(byteValue);
    }

    @Override
    public void parse(byte[] byteArr) {
        long seconds = ByteArr.convertToInt32(byteArr);
        System.out.println("seconds" + seconds);
        LocalDateTime date = LocalDateTime.of(1970, 01, 01, 00, 00, 00);
        value = date.plusSeconds(seconds);
    }

    public LocalDateTime getValue() {
        return value;
    }

}
