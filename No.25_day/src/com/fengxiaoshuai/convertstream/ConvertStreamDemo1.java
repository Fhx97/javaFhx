package com.fengxiaoshuai.convertstream;

import java.io.*;

public class ConvertStreamDemo1 {
    public static void main(String[] args) throws IOException {
        // 创建对象并制定字符编码
        InputStreamReader isr = new InputStreamReader(new FileInputStream("../No.25_day/output/h1.txt"),"gbk");
        // 读取数据
        int ch;
        while ((ch = isr.read()) != -1){
            System.out.print((char)ch);
        }
        isr.close();


    }
}
