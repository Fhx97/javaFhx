package com.fengxiaoshuai.convertstream;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class ConvertStreamDemo4 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("../No.25_day/output/h1_result1.txt", Charset.forName("gbk"));
        fw.write("好好学习，天天向上！");
        fw.close();
    }
}
