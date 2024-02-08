package com.fengxiaoshuai.algorithm;

public class LambdaDemo {
    // 函数式编程思想,忽略面向对象的复杂语法,强调做什么,而不是谁去做
    // lambda表达式格式:  (对应值方法的形参)->{对应值方法的方法体}
    // 可用来简化匿名内部类的书写
    // 只能简化函数式接口的匿名内部类的写法
    // 函数式接口:有且仅有一个抽象方法的接口叫做函数式接口,接口上方可以加上@FunctionalIneterface注解
    public static void main(String[] args) {
        method(
                () -> {System.out.println("丰小帅要回家了！！！");}
        );
    }
    public static void method(Swim s){
        s.swimming();
    }
}
@FunctionalInterface
interface Swim{
    public abstract void swimming();
}
