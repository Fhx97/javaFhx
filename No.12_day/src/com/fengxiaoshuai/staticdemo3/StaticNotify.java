package com.fengxiaoshuai.staticdemo3;

public class StaticNotify {
    // 静态方法只能访问静态变量和静态方法;
    // 非静态方法可以访问静态变量或者静态方法,也可以访问非静态的成员变量和非静态的成员方法。
    // 静态方法中是没有this关键字的。

    // 静态方法中,只能访问静态。
    // 非静态方法,可以访问所有。
    // 静态方法中没有this(当前方法调用者的地址值,由虚拟机赋值)关键字。

    // public:被JVM调用,访问权限足够大。
    // static:被JVM调用,不要创建对象,直接类名访问。因为main方法是静态的,所有测试类其他方法也需要是静态的。
    // void:被JVM调用,不需要给JVM返回值。
    // main:一个通用的名称,虽然不是关键字,但是被JVM识别。
    // String[] args:以前用于接收键盘录入数据的,现在没用。


}
