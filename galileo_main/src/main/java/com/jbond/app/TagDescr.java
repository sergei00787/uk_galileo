package com.jbond.app;

public class TagDescr {
    private int len;
    private String type;

    public TagDescr(int len, String type) {
        this.len = len;
        this.type = type;
    }

    public int getLen() {
        return len;
    }

    public String getType() {
        return type;
    }
}