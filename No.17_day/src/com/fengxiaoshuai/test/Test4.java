package com.fengxiaoshuai.test;

import java.util.Scanner;

public class Test4 {
    // 爬楼梯
    // 1层 1种
    // 2层 2种 2 1*2
    // 7层 21种 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入楼梯阶数：");
        int stairs = Integer.parseInt(sc.nextLine());
        System.out.println(getCount(stairs));



    }
    private static int getCount(int stairs){
        int count = 1;
        if(stairs == 1){
            return stairs;
        }else if(stairs == 2){
            return stairs;
        }
        return getCount(stairs-1)+getCount(stairs-2);
    }


}
