package com.fengxiaoshuai.staticdemo;

public class StudentsTest {
    // static表示静态,是Java中的一个修饰符,可以修饰成员方法,成员变量。

    // 静态变量:被static修饰的成员变量。
    // 被该类所有对象共享。类名调用(推荐)及对象名调用。
    // 静态变量时随着类加载而加载的,优先于对象出现的。
    // 不属于对象,属于类。
    // 属性是否可以被定义为静态,最主要取决于其是否"共享"。


    // 静态方法:被static修饰的成员方法。
    // 多用在测试类(带有main方法的类,是程序的入口)和工具类(不是用来描述一类事物而是帮我们做一些事情的类)中。
    // 在Javabean类(用来描述一类事物的类)中很少会用。
    // 类名调用(推荐)和对象名调用。




    public static void main(String[] args) {
        Students stu_1 = new Students("丰小帅",18,"男");
        stu_1.teacherName = "丰丰丰啊";
        Students stu_2 = new Students("丰大帅",20,"男");
        stu_1.study();
        stu_1.show();
        stu_2.study();
        stu_2.show();
    }
}
