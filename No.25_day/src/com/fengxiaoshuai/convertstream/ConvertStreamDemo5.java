package com.fengxiaoshuai.convertstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class ConvertStreamDemo5 {
    // 将本地文件中的gbk文件,转成utf-8
    public static void main(String[] args) throws IOException {
        FileReader fr  = new FileReader("../No.25_day/output/h1.txt", Charset.forName("gbk"));
        FileWriter fw = new FileWriter("../No.25_day/output/h1_result2.txt", StandardCharsets.UTF_8);
        int ch;
        while ((ch = fr.read()) != -1){
            fw.write(ch);
        }
        fw.close();
        fr.close();
    }
}
