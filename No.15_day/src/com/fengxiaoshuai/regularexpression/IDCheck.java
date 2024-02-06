package com.fengxiaoshuai.regularexpression;

import java.util.Scanner;

public class IDCheck {
    public static void main(String[] args) {
        String reg = "[1-9]\\d{5}(?:18|19|20)\\d{2}(?:0[1-9]|10|11|12)(?:0[1-9]|[1-2]\\d|30|31)\\d{3}[\\dXx]";
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身份证号：");
        String id = sc.next();
        boolean flag = id.matches(reg);
        if(flag){
            System.out.println("格式正确！");
        }else{
            System.out.println("格式不正确！");
        }


    }
}
