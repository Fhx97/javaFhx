package com.fengxiaoshuai.regularexpression;

import java.util.Scanner;

public class EmailCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的邮箱:");
        String email = sc.next();
        boolean emailFlag = email.matches("[0-9a-zA-Z]+@[0-9a-zA-Z]+");
        if(emailFlag){
            System.out.println("邮箱正确！");
        }else{
            System.out.println("邮箱不正确！");
        }

    }
}
