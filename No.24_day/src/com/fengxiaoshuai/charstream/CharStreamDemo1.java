package com.fengxiaoshuai.charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo1 {
    public static void main(String[] args) throws IOException {
        // 创建对象并关联本地文件
        FileReader fr = new FileReader("../No.24_day/output/f3.txt");
        // 读取数据 read(),读取之后方法的底层会进行解码并转成十进制
        // 字符流的底层也是字节流,默认也是一个字节一个字节读取的
        // 如果遇到中文就会一次读取多个,gbk一次读两个字节,utf-8一次读三个字节
        int ch;
        while ((ch = fr.read())!=-1){
            System.out.print((char)ch);
        }

        // 释放资源
        fr.close();


    }
}
