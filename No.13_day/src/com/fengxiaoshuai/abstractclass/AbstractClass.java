package com.fengxiaoshuai.abstractclass;

public abstract class AbstractClass {
    // 抽象方法:将共性的行为(方法)抽取到父类之后
    // 由于每一个子类执行的内容是不一样的,所以在父类中不能确定具体的方法体
    // 该方法就可以定位为抽象方法
    // 抽象类:如果一个类存在抽象方法,那么该类就必须声明为抽象类。
    // 抽象方法定义格式:public  abstract 返回值类型 方法名(参数列表);
    // 抽象类定义格式:public abstract class 类名{}

    // 抽象类不能实例化
    // 抽象类中不一定有抽象方法,有抽象方法的类一定是抽象类
    // 可以有构造方法
    // 抽象类的子类:要么重写抽象类中的所有抽象方法,要么是抽象类

    public abstract void work();
}
