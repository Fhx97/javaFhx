package com.fengxiaoshuai;

public class ObjectDemo_1 {

        // 类(设计图):是对象共同特征的描述
        // 对象:是真实存在的具体东西
        // 在Java中,必须先设计类,才能获得对象
    //  属性:成员变量
    // 修饰符 数据类型 变量名称 = 初始化值;
    // 一般无需指定初始化值,存在默认值
    String brand;
    double price;

    // 行为:成员方法
    public void call(){
        System.out.println("丰小帅正在呼叫你！！！");
    }

    public void playGame(){
        System.out.println("丰小帅正在玩英雄联盟！！！");
    }




}
