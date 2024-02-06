package com.fengxiaoshuai.stringtest;

import java.util.Scanner;

public class SymString {
    public static void main(String[] args) {
        // 字符串拼接和字符串反转使用StringBuilder比较好。
        // 键盘接收一个字符串,判断是否是对称字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.next();
        StringBuilder str_bul = new StringBuilder();
        String str_new =  str_bul.append(str).reverse().toString();
        if(str.equals(str_new)){
            System.out.println(str+"是对称字符串！");
        }else{
            System.out.println(str+"不是对称字符串！");
        }
    }
}
