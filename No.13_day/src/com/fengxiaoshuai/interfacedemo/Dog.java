package com.fengxiaoshuai.interfacedemo;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("吃骨头！");
    }

    public void dogPaddle(){
        System.out.println("狗刨！");
    }
}
