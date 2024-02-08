package com.fengxiaoshuai.test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入楼梯阶数：");
        int stairs = Integer.parseInt(sc.nextLine());
        System.out.println(getCount(stairs));

    }
    private static int getCount(int stairs){
        if(stairs == 1){
            return 1;
        }else if(stairs == 2){
            return 2;
        }else if(stairs == 3){
            return 4;
        }else{
            return getCount(stairs-1)+getCount(stairs-2)+getCount(stairs-3);
        }
    }
}
