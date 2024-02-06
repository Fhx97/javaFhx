package com.fengxiaoshuai;

import java.util.Scanner;

public class MathDemo1 {
    public static void main(String[] args) {
        // 判断一个数是否为质数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = sc.nextInt();
        boolean flag = true;
        // 一个数
        for (int i = 2; i < Math.sqrt(number); i++) {
            if(number % i == 0){
                System.out.println(number+"不是质数！");
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println(number+"是质数！");
        }


    }
}
