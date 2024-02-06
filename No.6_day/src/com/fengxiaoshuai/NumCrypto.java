package com.fengxiaoshuai;

import java.util.Scanner;

public class NumCrypto {
    public static void main(String[] args) {
        // 数字加密:先得到每位数,然后每位数都加上5,再对10求余,最后将所有数字反转,得到一串新数
        System.out.println("请输入您的数字密码:");
        Scanner sc = new Scanner(System.in);
        int password = sc.nextInt();
        int pw_tmp = password;
        int x = 0;
        int y = 0;
        int num_count = 0;
        // 求出输入密码位数
        while (password%10!=0){
            x = password % 10;
            password = password / 10;
            num_count+=1;
        }
        int[] pw_array = new int[num_count];
        for (int i = 0; i < pw_array.length; i++) {
            y = pw_tmp % 10 ;
            pw_array[i] = (y+5)%10;
            pw_tmp = pw_tmp / 10;
        }
        String new_password = "";
        for (int i = 0; i < pw_array.length; i++) {
            new_password+=pw_array[i];
        }
        System.out.println(new_password);
        System.out.println(Integer.parseInt(new_password));



    }
}

