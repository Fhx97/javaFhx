package com.fengxiaoshuai.convertstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class ConvertStreamDemo6 {
    // 利用字节流读取文件中的数据,每次读一整行,而且不能出现乱码
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new FileReader("../No.25_day/output/h1.txt", Charset.forName("GBK")));
        String str;
        while ((str = br.readLine()) != null){
            System.out.println(str);
        }
        br.close();

    }
}
