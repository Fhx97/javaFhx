package com.fengxiaoshuai.interfacedemo3;

public class TestDemo {
    public static void main(String[] args) {
        // 使用接口类型的引用变量引用具体类的对象
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        // 调用接口方法,实际执行具体类中的实现
        animal1.makeSound();
        animal2.makeSound();
    }
}
