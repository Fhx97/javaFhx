package com.fengxiaoshuai.regularexpression;

import java.util.Scanner;

public class PhoneCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的手机号:");
        String phone = sc.next();
        boolean phoneFlag = phone.matches("[1-9]\\d{10}");
        if(phoneFlag){
            System.out.println("手机号正确！");
        }else{
            System.out.println("手机号格式非法！");
        }
    }
}
