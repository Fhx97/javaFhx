package com.fengxiaoshuai.stringtest;

import java.util.Scanner;

public class RomanNum {
    public static void main(String[] args) {
        // 输入一个字符串
        System.out.println("请输入一个纯数字的字符串:");
        Scanner sc = new Scanner(System.in);
        StringBuilder str_bul = new StringBuilder();
        String str = sc.nextLine();
        // 罗马字符数组
        String[] roman_array = {"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        if(str.length()>9){
            System.out.println("格式错误！");
        }else{
            for (int i = 0; i < str.length(); i++) {
                str_bul.append(roman_array[str.charAt(i)-48]);

            }
            String str_new = str_bul.toString();
            System.out.println(str_new);
        }
    }
}
