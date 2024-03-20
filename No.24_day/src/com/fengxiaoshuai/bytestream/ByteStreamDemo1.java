package com.fengxiaoshuai.bytestream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        // 创建对象
        FileOutputStream fos = new FileOutputStream("..\\No.24_day\\output\\f1.txt");
        // 写入数据
        fos.write(97);
        // 释放资源
        fos.close();

    }
}
