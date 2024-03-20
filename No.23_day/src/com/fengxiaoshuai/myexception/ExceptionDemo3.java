package com.fengxiaoshuai.myexception;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nameStatus = 1;
        int ageStatus = 1;
        while (nameStatus != 0){
            System.out.println("请输入姓名：");
            String name = sc.next();
            nameStatus = judgeName(name);
        }
        while (ageStatus != 0 ){
            System.out.println("请输入年龄：");
            String age = sc.next();
            ageStatus = judgeAge(age);
        }


    }
    public static int judgeName(String name){
        if(name.length()>=3 && name.length() <= 10){
            return 0;
        }else{
            return 1;
        }
    }
    public static int judgeAge(String age) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 18; i < 49; i++) {
            arr.add(i);
        }
        try {
            if (arr.contains(Integer.parseInt(age))) {
                return 0;
            } else {
                return 1;
            }
        } catch (NumberFormatException e) {
//            e.printStackTrace();
            return 1;
        }
    }
}
