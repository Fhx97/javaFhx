package com.fengxiaoshuai.testdemo;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.nextLine();
        boolean flag = str.matches("[1-9][0-9]{0,9}");
        if(flag){
            System.out.println(Integer.parseInt(str));
        }else{
            System.out.println("格式非法！");
        }
    }
}
