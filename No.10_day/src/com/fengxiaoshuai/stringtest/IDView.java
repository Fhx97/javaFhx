package com.fengxiaoshuai.stringtest;

import java.util.Scanner;

public class IDView {
    public static void main(String[] args) {
        // 输入身份证信息,获取出生年月和性别
        System.out.println("请输入您要查询的身份证号:");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        if(id.length()!=18){
            System.out.println("输入的身份证信息有误！");
        }else{
            String year = id.substring(6,10);
            String month = id.substring(10,12);
            String day = id.substring(12,14);
            System.out.println("出生年月："+year+"年"+month+"月"+day+"日");
            String gender = id.substring(16,17);
            String[] girl = {"1","3","5","7","9"};
            boolean flag = true;
            for (int i = 0; i < girl.length; i++) {
                if(girl[i].equals(gender)){
                    flag = false;
                    System.out.println("性别:女");
                    break;
                }
            }
            if(flag){
                System.out.println("性别:男");
            }


        }
    }
}
