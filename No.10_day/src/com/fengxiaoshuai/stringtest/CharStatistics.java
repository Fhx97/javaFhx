package com.fengxiaoshuai.stringtest;

import java.util.Scanner;

public class CharStatistics {
    // 键盘录入一个字符串,统计该字符串中大写字母字符,小写字母字符,数字字符出现的次数
    public static void main(String[] args) {
        char[] upper_char = new char[26];
        char[] lower_char = new char[26];
        int[] num = new int[10];
        // 0-9装入num数组
        for (int i = 0; i < num.length; i++) {
            num[i] = i;
        }
        // 小写字母a-z装入lower_char数组
        for (int i = 0; i < lower_char.length; i++) {
            lower_char[i] = (char)('a' + i);
        }
        // 大写字母A-Z装入upper_char数组
        for (int i = 0; i < upper_char.length; i++) {
            upper_char[i] = (char)('A'+i);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段字符串:");
        String str = sc.next();
        int upper_count = 0;
        int lower_count = 0;
        int num_count = 0;
        char[] str_array = str.toCharArray();
        for (int i = 0; i < str_array.length; i++) {
//            for (int n = 0; n < num.length; n++) {
//                if(Integer.parseInt(str_array[i])==num[n]){
//                    num_count += 1;
//                    break;
//                }
//            }
            for (int j = 0; j < upper_char.length; j++) {
                if(str_array[i]==upper_char[j]){
                    upper_count += 1;
                    break;}
                }
            for (int k = 0; k < lower_char.length; k++) {
                if(str_array[i]==lower_char[k]){
                    lower_count += 1;
                    break;
                }
            }



        }
        for (int i = 0; i < str_array.length; i++) {
            System.out.print(str_array[i]+" ");
        }
        System.out.println();
        System.out.println("大写字母:"+upper_count+"个");
        System.out.println("小写字母:"+lower_count+"个");
        System.out.println("数字:"+(str_array.length-upper_count-lower_count)+"个");


    }
}
