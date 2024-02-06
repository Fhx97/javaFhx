package com.fengxiaoshuai.stringtest;

import java.util.Scanner;

public class StringAdjust {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个字符串:");
        String str_1 = sc.nextLine();
        System.out.println("请输入第二个字符串:");
        String str_2 = sc.nextLine();
        String[] arr = new String[str_2.length()];
//        String str_3 = "";
        boolean flag = true;
        if(str_1.length()!=str_2.length()){
            System.out.println(false);
        }else{
            for (int i = 0; i < arr.length; i++) {
                if(i==0){
                    arr[i] = str_2.substring(1)+str_2.charAt(0);
                }else{
                    arr[i] = arr[i-1].substring(1)+arr[i-1].charAt(0);
                }
            }

            for (int i = 0; i < arr.length; i++) {
                if(arr[i].equals(str_1)){
                    flag = false;
                    System.out.println(true);
                    break;
                }

            }
            if(flag){
                System.out.println(false);
            }
        }

    }
}
