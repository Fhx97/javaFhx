package com.fhx.fengxiaoshuai;

import static com.fhx.fengxiaoshuai.MethodDemo_2.printGFInfo;

public class MethodDemo_1 {
    public static void main(String[] args) {
        // 方法:程序中最小执行单元。
        // 方法定义:把一些代码打包在一起。
        // 方法调用:方法定义后并不是直接运行的,需要手动调用才能执行。
        // 方法与方法之间是平级关系,不能互相嵌套定义。
        // 方法的编写顺序与执行顺序无关。
        // return下面的代码肯定执行不到。
        // return:结束方法,放回结果。


        // 调用定义的第一个方法
        firstDemo();
        System.out.println("------------------------");
        // 调用其他文件的方法
        printGFInfo();

    }

    // 定义第一个简单方法
    public static void firstDemo(){
        System.out.println("丰小帅！！！");
        System.out.println("你真棒！！！");
        System.out.println("加油啊！！！");
        System.out.println("别怕,路就在前方！！！");
    }
}
