package com.fengxiaoshuai.stringtest;

import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.next();
        System.out.println(reversalString(str));
    }
    public static String reversalString(String str){
        String str_new = "";
        for (int i = 0; i < str.length(); i++) {
            str_new += str.charAt(str.length()-i-1);
        }
        return  str_new;
    }
}
