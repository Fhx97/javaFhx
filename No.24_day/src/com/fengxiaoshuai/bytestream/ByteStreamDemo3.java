package com.fengxiaoshuai.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        // 创建对象(如果文件不存在,就直接报错)
        FileInputStream fis = new FileInputStream("..\\output\\f2.txt");

        // 读取数据(一次读一个字节,读出来的是数据在ASCII上对应的数字;读到文件末尾了,read方法返回-1)
//        int b1 = fis.read();
//        System.out.println(b1);

        // 循环读取
        int b;
        while ((b = fis.read()) != -1){
            System.out.println(b);
        }
        // 释放资源
        fis.close();


    }
}
