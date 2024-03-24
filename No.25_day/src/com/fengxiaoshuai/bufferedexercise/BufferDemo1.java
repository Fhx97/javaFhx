package com.fengxiaoshuai.bufferedexercise;

import javax.xml.transform.Source;
import java.io.*;

public class BufferDemo1 {
    // 四种方式拷贝文件 并统计各自用时
    public static void main(String[] args) throws IOException {
        // 字节基本流:一次读写一个字节
        long startTime = System.nanoTime();
        FileInputStream fis1 = new FileInputStream("../No.25_day/output/f1.txt");
        FileOutputStream fos1 = new FileOutputStream("../No.25_day/output/copyF1.txt");
        int b;
        while ((b = fis1.read())!=-1){
            fos1.write(b);
        }
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;
        fos1.close();
        fis1.close();
        System.out.println("程序运行时间：" + elapsedTime + " 纳秒");
        // 字节基本流:一次读写一个字节数组
        long startTime1 = System.nanoTime();
        FileInputStream fis2 = new FileInputStream("../No.25_day/output/f1.txt");
        FileOutputStream fos2 = new FileOutputStream("../No.25_day/output/copyF2.txt");
        byte[] bytes = new byte[1024];
        int len;
        while ((len = fis2.read(bytes))!=-1){
            fos2.write(bytes,0,len);
        }
        fos2.close();
        fis2.close();
        long endTime1 = System.nanoTime();
        long elapsedTime1 = endTime1 - startTime1;
        System.out.println("程序运行时间：" + elapsedTime1 + " 纳秒");
        // 字符缓冲流:一次读写一个字节
        long startTime2 = System.nanoTime();
        FileReader fr1 = new FileReader("../No.25_day/output/f1.txt");
        FileWriter fw1 = new FileWriter("../No.25_day/output/copyF3.txt");
        int b1;
        while ((b1 = fr1.read())!=-1){
            fw1.write(b1);
        }
        fr1.close();
        fw1.close();
        long endTime2 = System.nanoTime();
        long elapsedTime2 = endTime2 - startTime2;
        System.out.println("程序运行时间：" + elapsedTime2 + " 纳秒");
        // 字符缓冲流:一次对象一个字节数组
        long startTime3 = System.nanoTime();
        FileReader fr2 = new FileReader("../No.25_day/output/f1.txt");
        FileWriter fw2 = new FileWriter("../No.25_day/output/copyF4.txt");
        char[] chars = new char[1024];
        int len1;
        while ((len1 = fr2.read(chars))!=-1){
            fw2.write(chars,0,len1);
        }
        fw2.close();
        fr2.close();
        long endTime3 = System.nanoTime();
        long elapsedTime3 = endTime3 - startTime3;
        System.out.println("程序运行时间：" + elapsedTime3 + " 纳秒");

    }
}
