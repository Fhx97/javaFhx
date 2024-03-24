package com.fengxiaoshuai.bufferedstream1;

import java.io.*;

public class BufferedStreamDemo3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("../No.25_day/output/f2.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("../No.25_day/output/f2_result.txt"));
        // readline方法读取一整行,一次读一整行,遇到回车换行结束
        // 但是不会把回车换行读到内存当中
        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
        bw.write("哥们的帅气，百度搜索不到！");
        // 跨平台换行
        bw.newLine();
        bw.write("以后我结婚了，你一定要来哦，没有新娘哥们会很尴尬！");
        bw.close();


    }
}
