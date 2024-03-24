package com.fengxiaoshuai.bufferedstream1;

import java.io.*;

public class BufferedStreamDemo1 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("../No.25_day/output/f1.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("../No.25_day/output/f1_result.txt"));
        int b;
        while ((b = bis.read()) != -1){
            bos.write(b);
        }
        bos.close();
        bis.close();

    }
}
