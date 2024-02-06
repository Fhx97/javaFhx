package com.fengxiaoshuai.stringtest;

import java.util.Scanner;

public class StringTraverse {
    // 键盘录入一个字符串,使用程序实现在控制台遍历该字符串
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一串字符串:");
        String str = sc.next();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }


    }
}
