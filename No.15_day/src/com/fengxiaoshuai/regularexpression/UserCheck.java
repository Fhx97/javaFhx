package com.fengxiaoshuai.regularexpression;

import java.util.Scanner;

public class UserCheck {
    public static void main(String[] args) {
        System.out.println("请输入用户名：");
        Scanner sc = new Scanner(System.in);
        String userName = sc.next();
        Boolean flag = userName.matches("[a-zA-Z0-9_]{4,16}");
        if(flag){
            System.out.println("用户名格式正确！");
        }else{
            System.out.println("用户名格式不正确！");
        }
    }
}
