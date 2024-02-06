package com.fengxiaoshuai.regularexpression;

import java.util.Scanner;

public class RegularDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的账户：");
        String number = sc.next();
        boolean flag = number.matches("[1-9]\\d{5,19}");
        if(flag){
            System.out.println("QQ号正确！");
        }else{
            System.out.println("QQ号不正确！");
        }
    }
}
