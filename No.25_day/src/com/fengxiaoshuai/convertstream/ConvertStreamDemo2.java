package com.fengxiaoshuai.convertstream;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class ConvertStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("../No.25_day/output/h1.txt", Charset.forName("gbk"));
        int ch;
        while ((ch = fr.read())!=-1){
            System.out.print((char)ch);
        }
        fr.close();
    }
}
