package com.fengxiaoshuai.stringtest;

import java.util.Scanner;

public class PhoneBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的电话号码:");
        String str = sc.nextLine();
        String start = str.substring(0,3);
        System.out.println(start);
        if(str.length()!=11){
            System.out.println("请输入正确的号码！");
        }else{
            char[] arr = new char[11];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = str.charAt(i);
            }
            for (int i = 3; i < 7; i++) {
                arr[i] = '*';
            }
            String new_str = new String(arr);
            System.out.println(new_str);
        }

    }
}
