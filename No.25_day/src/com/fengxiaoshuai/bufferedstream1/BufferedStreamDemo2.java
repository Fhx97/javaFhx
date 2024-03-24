package com.fengxiaoshuai.bufferedstream1;

import java.io.*;

public class BufferedStreamDemo2 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("../No.25_day/output/f1.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("../No.25_day/output/f1_result1.txt"));
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }
        bos.close();
        bis.close();
    }
}
