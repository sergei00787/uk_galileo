package com.jbond.app;

import java.util.HashMap;
import java.util.Map;

public class GalileoTagExtTable {
    private Map<Byte,TagDescr> table = new HashMap<Byte, TagDescr>();
    public GalileoTagExtTable() {
        this.table = new HashMap<Byte, TagDescr>();
        //Tags MODBUS 0-31
        table.put((byte) 0x01, new TagDescr(4, "uint"));
        table.put((byte) 0x02, new TagDescr(4, "uint"));
        table.put((byte) 0x03, new TagDescr(4, "uint"));
        table.put((byte) 0x04, new TagDescr(4, "uint"));
        table.put((byte) 0x05, new TagDescr(4, "uint"));
        table.put((byte) 0x06, new TagDescr(4, "uint"));
        table.put((byte) 0x07, new TagDescr(4, "uint"));
        table.put((byte) 0x08, new TagDescr(4, "uint"));
        table.put((byte) 0x09, new TagDescr(4, "uint"));
        table.put((byte) 0x0A, new TagDescr(4, "uint"));
        table.put((byte) 0x0B, new TagDescr(4, "uint"));
        table.put((byte) 0x0C, new TagDescr(4, "uint"));
        table.put((byte) 0x0D, new TagDescr(4, "uint"));
        table.put((byte) 0x0E, new TagDescr(4, "uint"));
        table.put((byte) 0x0F, new TagDescr(4, "uint"));
        table.put((byte) 0x10, new TagDescr(4, "uint"));
        table.put((byte) 0x11, new TagDescr(4, "uint"));
        table.put((byte) 0x12, new TagDescr(4, "uint"));
        table.put((byte) 0x13, new TagDescr(4, "uint"));
        table.put((byte) 0x14, new TagDescr(4, "uint"));
        table.put((byte) 0x15, new TagDescr(4, "uint"));
        table.put((byte) 0x16, new TagDescr(4, "uint"));
        table.put((byte) 0x17, new TagDescr(4, "uint"));
        table.put((byte) 0x18, new TagDescr(4, "uint"));
        table.put((byte) 0x19, new TagDescr(4, "uint"));
        table.put((byte) 0x1A, new TagDescr(4, "uint"));
        table.put((byte) 0x1B, new TagDescr(4, "uint"));
        table.put((byte) 0x1C, new TagDescr(4, "uint"));
        table.put((byte) 0x1D, new TagDescr(4, "uint"));
        table.put((byte) 0x1E, new TagDescr(4, "uint"));
        table.put((byte) 0x1F, new TagDescr(4, "uint"));
        table.put((byte) 0x20, new TagDescr(4, "uint"));
        //Tags BLUETOOTH 0-63
        table.put((byte) 0x20, new TagDescr(4, "uint"));
        table.put((byte) 0x21, new TagDescr(4, "uint"));
        table.put((byte) 0x22, new TagDescr(4, "uint"));
        table.put((byte) 0x23, new TagDescr(4, "uint"));
        table.put((byte) 0x24, new TagDescr(4, "uint"));
        table.put((byte) 0x25, new TagDescr(4, "uint"));
        table.put((byte) 0x26, new TagDescr(4, "uint"));
        table.put((byte) 0x27, new TagDescr(4, "uint"));
        table.put((byte) 0x28, new TagDescr(4, "uint"));
        table.put((byte) 0x29, new TagDescr(4, "uint"));
        table.put((byte) 0x2A, new TagDescr(4, "uint"));
        table.put((byte) 0x2B, new TagDescr(4, "uint"));
        table.put((byte) 0x2C, new TagDescr(4, "uint"));
        table.put((byte) 0x2D, new TagDescr(4, "uint"));
        table.put((byte) 0x2E, new TagDescr(4, "uint"));
        table.put((byte) 0x2F, new TagDescr(4, "uint"));
        table.put((byte) 0x30, new TagDescr(4, "uint"));
        table.put((byte) 0x31, new TagDescr(4, "uint"));
        table.put((byte) 0x32, new TagDescr(4, "uint"));
        table.put((byte) 0x33, new TagDescr(4, "uint"));
        table.put((byte) 0x34, new TagDescr(4, "uint"));
        table.put((byte) 0x35, new TagDescr(4, "uint"));
        table.put((byte) 0x36, new TagDescr(4, "uint"));
        table.put((byte) 0x37, new TagDescr(4, "uint"));
        table.put((byte) 0x38, new TagDescr(4, "uint"));
        table.put((byte) 0x39, new TagDescr(4, "uint"));
        table.put((byte) 0x3A, new TagDescr(4, "uint"));
        table.put((byte) 0x3B, new TagDescr(4, "uint"));
        table.put((byte) 0x3C, new TagDescr(4, "uint"));
        table.put((byte) 0x3D, new TagDescr(4, "uint"));
        table.put((byte) 0x3E, new TagDescr(4, "uint"));
        table.put((byte) 0x3F, new TagDescr(4, "uint"));
        table.put((byte) 0x40, new TagDescr(4, "uint"));
        table.put((byte) 0x41, new TagDescr(4, "uint"));
        table.put((byte) 0x42, new TagDescr(4, "uint"));
        table.put((byte) 0x43, new TagDescr(4, "uint"));
        table.put((byte) 0x44, new TagDescr(4, "uint"));
        table.put((byte) 0x45, new TagDescr(4, "uint"));
        table.put((byte) 0x46, new TagDescr(4, "uint"));
        table.put((byte) 0x47, new TagDescr(4, "uint"));
        table.put((byte) 0x48, new TagDescr(4, "uint"));
        table.put((byte) 0x49, new TagDescr(4, "uint"));
        table.put((byte) 0x4A, new TagDescr(4, "uint"));
        table.put((byte) 0x4B, new TagDescr(4, "uint"));
        table.put((byte) 0x4C, new TagDescr(4, "uint"));
        table.put((byte) 0x4D, new TagDescr(4, "uint"));
        table.put((byte) 0x4E, new TagDescr(4, "uint"));
        table.put((byte) 0x4F, new TagDescr(4, "uint"));
        table.put((byte) 0x50, new TagDescr(4, "uint"));
        table.put((byte) 0x51, new TagDescr(4, "uint"));
        table.put((byte) 0x52, new TagDescr(4, "uint"));
        table.put((byte) 0x53, new TagDescr(4, "uint"));
        table.put((byte) 0x54, new TagDescr(4, "uint"));
        table.put((byte) 0x55, new TagDescr(4, "uint"));
        table.put((byte) 0x56, new TagDescr(4, "uint"));
        table.put((byte) 0x57, new TagDescr(4, "uint"));
        table.put((byte) 0x58, new TagDescr(4, "uint"));
        table.put((byte) 0x59, new TagDescr(4, "uint"));
        table.put((byte) 0x5A, new TagDescr(4, "uint"));
        table.put((byte) 0x5B, new TagDescr(4, "uint"));
        table.put((byte) 0x5C, new TagDescr(4, "uint"));
        table.put((byte) 0x5D, new TagDescr(4, "uint"));
        table.put((byte) 0x5E, new TagDescr(4, "uint"));
        table.put((byte) 0x5F, new TagDescr(4, "uint"));
        table.put((byte) 0x60, new TagDescr(4, "uint"));
        //Tags MODBUS 32-63
        table.put((byte) 0x61, new TagDescr(4, "uint"));
        table.put((byte) 0x62, new TagDescr(4, "uint"));
        table.put((byte) 0x63, new TagDescr(4, "uint"));
        table.put((byte) 0x64, new TagDescr(4, "uint"));
        table.put((byte) 0x65, new TagDescr(4, "uint"));
        table.put((byte) 0x66, new TagDescr(4, "uint"));
        table.put((byte) 0x67, new TagDescr(4, "uint"));
        table.put((byte) 0x68, new TagDescr(4, "uint"));
        table.put((byte) 0x69, new TagDescr(4, "uint"));
        table.put((byte) 0x6A, new TagDescr(4, "uint"));
        table.put((byte) 0x6B, new TagDescr(4, "uint"));
        table.put((byte) 0x6C, new TagDescr(4, "uint"));
        table.put((byte) 0x6D, new TagDescr(4, "uint"));
        table.put((byte) 0x6E, new TagDescr(4, "uint"));
        table.put((byte) 0x6F, new TagDescr(4, "uint"));
        table.put((byte) 0x70, new TagDescr(4, "uint"));
        table.put((byte) 0x71, new TagDescr(4, "uint"));
        table.put((byte) 0x72, new TagDescr(4, "uint"));
        table.put((byte) 0x73, new TagDescr(4, "uint"));
        table.put((byte) 0x74, new TagDescr(4, "uint"));
        table.put((byte) 0x75, new TagDescr(4, "uint"));
        table.put((byte) 0x76, new TagDescr(4, "uint"));
        table.put((byte) 0x77, new TagDescr(4, "uint"));
        table.put((byte) 0x78, new TagDescr(4, "uint"));
        table.put((byte) 0x79, new TagDescr(4, "uint"));
        table.put((byte) 0x7A, new TagDescr(4, "uint"));
        table.put((byte) 0x7B, new TagDescr(4, "uint"));
        table.put((byte) 0x7C, new TagDescr(4, "uint"));
        table.put((byte) 0x7D, new TagDescr(4, "uint"));
        table.put((byte) 0x7E, new TagDescr(4, "uint"));
        table.put((byte) 0x7F, new TagDescr(4, "uint"));
        table.put((byte) 0x80, new TagDescr(4, "uint"));
        table.put((byte) 0x81, new TagDescr(2, "uint"));
        table.put((byte) 0x82, new TagDescr(2, "uint"));
        table.put((byte) 0x83, new TagDescr(2, "uint"));
        table.put((byte) 0x84, new TagDescr(2, "uint"));
        table.put((byte) 0x85, new TagDescr(1, "uint"));
        // Tags Ext TemperSenseors 0-7
        table.put((byte) 0x86, new TagDescr(4, "bytearr"));
        table.put((byte) 0x87, new TagDescr(4, "bytearr"));
        table.put((byte) 0x88, new TagDescr(4, "bytearr"));
        table.put((byte) 0x89, new TagDescr(4, "bytearr"));
        table.put((byte) 0x8A, new TagDescr(4, "bytearr"));
        table.put((byte) 0x8B, new TagDescr(4, "bytearr"));
        table.put((byte) 0x8C, new TagDescr(4, "bytearr"));
        table.put((byte) 0x8D, new TagDescr(4, "bytearr"));

        table.put((byte) 0x8E, new TagDescr(4, "bytearr"));
        table.put((byte) 0x8F, new TagDescr(4, "uint"));
        table.put((byte) 0x90, new TagDescr(4, "uint"));
        table.put((byte) 0x91, new TagDescr(4, "uint"));

        table.put((byte) 0x92, new TagDescr(15, "bytearr"));

        table.put((byte) 0x93, new TagDescr(1, "uint"));

        table.put((byte) 0x93, new TagDescr(20, "bytearr"));

        //Tags Wheels TPMS 0-33
        table.put((byte) 0xD9, new TagDescr(3, "bytearr"));
        table.put((byte) 0xDA, new TagDescr(3, "bytearr"));
        table.put((byte) 0xDB, new TagDescr(3, "bytearr"));
        table.put((byte) 0xDC, new TagDescr(3, "bytearr"));
        table.put((byte) 0xDD, new TagDescr(3, "bytearr"));
        table.put((byte) 0xDE, new TagDescr(3, "bytearr"));
        table.put((byte) 0xDF, new TagDescr(3, "bytearr"));
        table.put((byte) 0xE0, new TagDescr(3, "bytearr"));
        table.put((byte) 0xE1, new TagDescr(3, "bytearr"));
        table.put((byte) 0xE2, new TagDescr(3, "bytearr"));
        table.put((byte) 0xE3, new TagDescr(3, "bytearr"));
        table.put((byte) 0xE4, new TagDescr(3, "bytearr"));
        table.put((byte) 0xE5, new TagDescr(3, "bytearr"));
        table.put((byte) 0xE6, new TagDescr(3, "bytearr"));
        table.put((byte) 0xE7, new TagDescr(3, "bytearr"));
        table.put((byte) 0xE8, new TagDescr(3, "bytearr"));
        table.put((byte) 0xE9, new TagDescr(3, "bytearr"));
        table.put((byte) 0xEA, new TagDescr(3, "bytearr"));
        table.put((byte) 0xEB, new TagDescr(3, "bytearr"));
        table.put((byte) 0xEC, new TagDescr(3, "bytearr"));
        table.put((byte) 0xED, new TagDescr(3, "bytearr"));
        table.put((byte) 0xEE, new TagDescr(3, "bytearr"));
        table.put((byte) 0xEF, new TagDescr(3, "bytearr"));
        table.put((byte) 0xF0, new TagDescr(3, "bytearr"));
        table.put((byte) 0xF1, new TagDescr(3, "bytearr"));
        table.put((byte) 0xF2, new TagDescr(3, "bytearr"));
        table.put((byte) 0xF3, new TagDescr(3, "bytearr"));
        table.put((byte) 0xF4, new TagDescr(3, "bytearr"));
        table.put((byte) 0xF5, new TagDescr(3, "bytearr"));
        table.put((byte) 0xF6, new TagDescr(3, "bytearr"));
        table.put((byte) 0xF7, new TagDescr(3, "bytearr"));
        table.put((byte) 0xF8, new TagDescr(3, "bytearr"));
        table.put((byte) 0xF9, new TagDescr(3, "bytearr"));
        table.put((byte) 0xFA, new TagDescr(3, "bytearr"));
    }

    public TagDescr getTagDescr(byte tag){
        try {
            return table.get(tag);
        } catch (ClassCastException ccex){
            System.err.println(ccex.getMessage());
        } catch (NullPointerException npe) {
            System.err.println(npe.getMessage());
        }
        return null;
    }
}
