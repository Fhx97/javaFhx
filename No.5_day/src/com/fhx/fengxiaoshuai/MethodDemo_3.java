package com.fhx.fengxiaoshuai;

import java.util.Scanner;

public class MethodDemo_3 {
    public static void main(String[] args) {
        autoArg();

    }
    public static void autoArg(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数:");
        int num_1 = sc.nextInt();
        System.out.println("请输入第二个数:");
        int num_2 = sc.nextInt();
        System.out.println(num_1+"与"+num_2+"的和为:"+(num_1+num_2));
    }
}
