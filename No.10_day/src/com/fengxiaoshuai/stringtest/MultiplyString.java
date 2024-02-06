package com.fengxiaoshuai.stringtest;

import java.util.Scanner;

public class MultiplyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数:");
        String num_1 = sc.next();
        System.out.println("请输入第二个数:");
        String num_2 = sc.next();
        char[] num_arr1 = num_1.toCharArray();
        char[] num_arr2 = num_2.toCharArray();


        int int_num1 = getInt(num_arr1);
        int int_num2 = getInt(num_arr2);
        int num = int_num1*int_num2;
        StringBuilder str = new StringBuilder();
        String result = str.append(num).toString();
        System.out.println(int_num1+"和"+int_num2+"的乘积为:"+result);





    }
    public static int getInt(char[] arr){
        int num = 0;
        int[] int_array = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int_array[i] = arr[i]-48;
        }
        for (int i = 0; i < int_array.length; i++) {
            if(i!=(int_array.length-1)){
                num = (num + int_array[i])*10;
                System.out.println(num);
            }else {
                num = num + int_array[i];
                System.out.println(num);
            }
        }
        return num;
    }
}
