package com.fengxiaoshuai.bytestream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("..\\No.24_day\\output\\f2.txt");
        String str = "feng\nxiao\nshuai";
        byte[] arr = str.getBytes();
        System.out.println(Arrays.toString(arr));
        fos.write(arr);
        fos.close();

    }
}
