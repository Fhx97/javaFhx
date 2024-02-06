package com.fengxiaoshuai.interfacedemo;

public class BaseDemo {
    // 接口:接口就是一种规则,是对行为的抽象。
    // 接口定义:public interface 接口名{}
    // 接口不能实例化
    // 接口和类之间是实现关系,通过implements关键字提示
    // 接口的子类(实现类):要么重写接口中的所有抽象方法,要么是抽象类。

    // 接口和类的实现关系,可以单实现,也可以多实现。
    // public class 类名 implements 接口名1,接口名2{}

    // 实现类还可以在继承一个类的同时实现多个接口。
    // public class 类名 extends 父类i implements 接口名1,接口名2{}

    // 接口中的成员变量只能是常量,默认修饰符是 public static final
    // 接口中没有构造方法
    // 默认抽象方法 public abstract(JDK7以前,接口只能定义抽象方法。)

    // 接口和接口的关系:继承关系,可以单继承,也可以多继承。

}
