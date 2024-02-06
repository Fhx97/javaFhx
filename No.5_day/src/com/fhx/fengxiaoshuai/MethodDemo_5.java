package com.fhx.fengxiaoshuai;

public class MethodDemo_5 {
    public static void main(String[] args) {
        // 一般常用于赋值。
        int c = getSum(1,2);
        System.out.println(c);
    }
    // 带返回值的方法,把void改成返回值类型。
    public static int getSum(int num_1,int num_2){
        int result = num_1 + num_2;
        return result;
    }
}
