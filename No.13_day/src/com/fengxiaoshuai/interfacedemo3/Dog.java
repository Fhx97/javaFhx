package com.fengxiaoshuai.interfacedemo3;

public class Dog implements Animal{

    @Override
    public void makeSound() {
        System.out.println("woof！");
    }
}
