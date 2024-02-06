package com.fengxiaoshuai.interfacedemo;

import com.fengxiaoshuai.interfacedemo.Dog;

public class TestDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("小狗",3);
        Frog frog = new Frog("青蛙",1);
        Rabbit rabbit = new Rabbit("兔子",2);

        dog.dogPaddle();
        dog.eat();
        frog.swim();
        frog.eat();

        rabbit.eat();
    }
}
