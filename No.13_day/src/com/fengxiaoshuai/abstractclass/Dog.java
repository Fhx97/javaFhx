package com.fengxiaoshuai.abstractclass;

public class Dog extends AbstractDemo{

    public Dog(){};

    public Dog(String name,int age){
        super(name,age);
    }

    @Override
    public void eat() {
        System.out.println("吃骨头！");
    }
}
