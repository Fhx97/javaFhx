package com.fhx.fengxiaoshuai;

public class MethodDemo_4 {
    public static void main(String[] args) {
        // 调用带参数的方法时,调用时参数须跟方法定义时参数一致
        // 实参:方法调用中的参数。
        autoArg2(23,33);

    }
    // 带参数的方法
    // 形参:方法定义中的参数。
    public static void autoArg2(int num_1,int num_2){
        int result = num_1 + num_2;
        System.out.println(result);
    }
}
