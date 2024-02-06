package com.fengxiaoshuai.stringtest;

import java.util.Scanner;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        // 链式编程:在调用一个方法的时候,不需要用变量接收它的结果,就可以继续调用其他结果
        String str = getString().substring(1).replace("a","fhx");
        System.out.println(str);
    }
    public static String getString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        return str;
    }
}
