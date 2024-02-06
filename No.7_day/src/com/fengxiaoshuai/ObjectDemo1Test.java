package com.fengxiaoshuai;

public class ObjectDemo1Test {
    public static void main(String[] args) {
        // 如何获取对象
        // 类名 对象名 = new 类名();
        // 创建Demo_1对象
        ObjectDemo_1 p = new ObjectDemo_1();

        // 赋值
        p.brand = "Apple";
        p.price = 7999.99;
        System.out.println(p.brand);
        System.out.println(p.price);

        // 调用Demo_1中的方法
        p.call();
        p.playGame();

        // javabean类:用来描述一类事物的类,不写main方法
        // 测试类:编写main方法的类,在测试类中创建javabean类的对象并进行赋值调用。
        // 一个java文件可以定义多个class类,且只能一个类是public修饰,且public修饰的类名必须成为代码文件名
        // 数据开发中,建议一个文件定义一个class类。




    }
}
