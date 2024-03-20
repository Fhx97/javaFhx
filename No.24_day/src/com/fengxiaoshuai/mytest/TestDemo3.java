package com.fengxiaoshuai.mytest;

import java.io.*;
import java.util.Arrays;

public class TestDemo3 {
    // 对文本中的数据进行排序 将"2-1-9-4-7-8"变为"1-2-4-7-8-9"
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("../No.24_day/output/f5.txt");
        StringBuilder sb = new StringBuilder();
        int ch;
        while ((ch = fr.read()) != -1){
            sb.append((char)ch);
        }
        fr.close();
        System.out.println(sb);
        String str = sb.toString();
        String[] arrStr = str.split("-");
        int[] arrNum = new int[arrStr.length];
        for (int i = 0; i < arrStr.length; i++) {
            arrNum[i] = Integer.parseInt(arrStr[i]);
        }
        String str1 = "";
        Arrays.sort(arrNum);
        for (int i = 0; i < arrNum.length; i++) {
            if(i < arrNum.length - 1){
                str1 = str1 + arrNum[i] + "-";
            }else{
                str1 = str1 + arrNum[i];
            }
        }
        System.out.println(str1);
        FileWriter fw = new FileWriter("../No.24_day/output/f6.txt");
        fw.write(str1);
        fw.close();
    }
}
