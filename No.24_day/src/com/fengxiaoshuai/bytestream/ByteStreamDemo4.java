package com.fengxiaoshuai.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("..\\No.24_day\\output\\f1.txt");
        byte[] bytes = new byte[2];
        int len = fis.read(bytes);
        System.out.println(len);

        String str = new String(bytes);
        System.out.println(str);
    }
}
