package com.fengxiaoshuai.convertstream;

import java.io.*;

public class ConvertStreamDemo3 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("../No.25_day/output/h1_result.txt"),"gbk");
        osw.write("丰小帅，你好棒！");
        osw.close();

    }
}
