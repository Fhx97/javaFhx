package com.fengxiaoshuai.arraytest;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {
        // nextInt();nextDouble();next();遇到空格/制表符/回车就停止接收。
        Scanner sc = new Scanner(System.in);
        /*System.out.println("请输入第一个整数:");
        int num_1 = sc.nextInt();
        System.out.println(num_1);
        System.out.println("请输入第二个整数:");
        int num_2 = sc.nextInt();
        System.out.println(num_2);*/

        // nextLine():接收字符串,可以接受空格、制表符,遇到回车才停止接收数据。
        System.out.println("请输入一个字符串:");
        String s = sc.nextLine();
        System.out.println(s);

        // 不建议上述两种方法混用:先用nextInt,再用nextLine会导致下面的nextLine接收不到数据。

    }


}
