package com.fhx.fengxiaoshuai;

import java.lang.reflect.Array;
import java.util.Scanner;

public class MethodDemo_7 {
    public static void main(String[] args) {
        double[] arr_x = {12,2,31,4};
        printArray(arr_x);
        System.out.println("\n");
        System.out.println("-----------------------------");
        System.out.println(getMax(arr_x));
        System.out.println("-----------------------------");
        findNum(arr_x);
        System.out.println("-----------------------------");
        double[] arr_z = tranArray(arr_x);
        printArray(arr_z);
        System.out.println("\n");
        System.out.println("-----------------------------");
        System.out.println(arr_x);
        System.out.println(arr_z);

    }
    // 遍历数组,并打印在一行上。
    public static void printArray(double[] arr_1){
        for (int i = 0; i < arr_1.length; i++) {
            System.out.print(arr_1[i]+" ");
        }
    }

    // 求数组最大值
    public static double getMax(double[] arr_1){
        double t_max = arr_1[0];
        for (int i = 1; i < arr_1.length; i++) {
            t_max = t_max > arr_1[i] ? t_max : arr_1[i];
        }
        return t_max;

    }
    // 判断是否存在,将结果返回调用处
    public static void findNum(double[] arr_1){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数:");
        double num = sc.nextDouble();
        boolean flag = false;
        for (int i = 0; i < arr_1.length; i++) {
            if (arr_1[i] == num){
                flag = true;
                break;
            }

        }
        if(flag){
            System.out.println(num+"在数组中！");}else{
            System.out.println(num+"不在数组中！");
        }
    }
    // 赋值数组,将新数组返回

    public static double[] tranArray(double[] arr_1){
        double[] arr_new = new double[arr_1.length];
        for (int i = 0; i < arr_1.length; i++) {
            arr_new[i] = arr_1[i];
        }
        return arr_new;
    }
}
