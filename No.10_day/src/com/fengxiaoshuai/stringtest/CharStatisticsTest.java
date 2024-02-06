package com.fengxiaoshuai.stringtest;

import java.util.Scanner;

public class CharStatisticsTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.next();
        int upper_count = 0;
        int lower_count = 0;
        int num_count = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
                if(c >= 'a' && c <= 'z'){
                    lower_count += 1;
                }else if (c >= 'A' && c <= 'Z'){
                    upper_count += 1;
                }else if (c >= '0' && c <= '9'){
                    num_count+=1;
                }

        }
        System.out.println("大写字母:"+upper_count);
        System.out.println("小写字母:"+lower_count);
        System.out.println("数字:"+num_count);

    }
}
