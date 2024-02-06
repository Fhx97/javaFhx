package com.fengxiaoshuai.regularexpression;

import java.util.Scanner;

public class FormalDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的QQ号:");
        String qqNumber = sc.next();
        char[] qqArr = qqNumber.toCharArray();
        char[] comArr = new char[10];
        for (int i = 0; i < comArr.length; i++) {
            comArr[i] = (char)('0' + i);
        }
        int count = 0;
        for (int i = 0; i < qqArr.length; i++) {
            for (int j = 0; j < comArr.length; j++) {
                if(qqArr[i]==comArr[j]){
                    count++;
                    break;
                }
            }
        }
        if(qqNumber.length()>20 || qqNumber.length()< 6){
            System.out.println("您输入的QQ号不合法！");
        }else{
            if(qqArr[0]=='0'){
                System.out.println("您输入的QQ号不合法！");
            }else{
                if(qqArr.length!=count){
                    System.out.println("您输入的QQ号不合法！");
                }else{
                    System.out.println("您输入的非常对！");
                }
            }
        }
    }
}
