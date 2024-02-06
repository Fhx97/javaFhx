package com.fengxiaoshuai;

public class Demo_1 {
    public static void main(String[] args) {
        // 基本数据类型
        // 数据值存储在自己的空间中
        // 赋值给其他变量,也是赋的真实值

        // 引用数据类型
        // 数据值是存储在其他空间中,自己空间中存储的是地址值
        // 赋值给其他空间,赋的地址值
        int a = 100;
        int b = a;
        a = 50;
        System.out.println(a);
        System.out.println(b);

        // 传递基本数据类型时,传递的是真实数据,形参的改变,不影响实际参数的值。
        // 传递引用数据类型时,传递的是地址值,形参的改变,影响实际参数的值。

    }
}
