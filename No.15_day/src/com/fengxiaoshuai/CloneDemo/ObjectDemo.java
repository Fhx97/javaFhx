package com.fengxiaoshuai.CloneDemo;

public class ObjectDemo {
    // Object是Java中的顶级父类。所以类都直接或间接的继承于Object类。
    // Object类中的方法可以被所有子类访问。
    // toString方法打印的是地址值,如果需要打印出属性值,利用子类对toString方法进行重写。

    // clone:对象克隆(对象拷贝,对象复制),把A对象的属性值完全拷贝给B对象。
    // 浅克隆:不管对象内部的属性是基本数据类型还是引用数据类型,都完全拷贝过来。
    // 深克隆:基本数据类型拷贝过来,字符串复用,引用数据类型会重新创建新的。

    // Objects是一个对象工具类,提供一些操作对象的方法。
    // equals(对象1,对象2):先做非空判断,比较两个对象。
    // isNull(对象):判断对象是否为空。
    // nonNull(对象):判断对象是否不为空。





}
