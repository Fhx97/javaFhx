package com.fengxiaoshuai.interfacedemo2;

public class BasketballPlayer extends Person {
    public BasketballPlayer() {
    }

    public BasketballPlayer(String name, int age) {
        super(name, age);

    }

    @Override
    public void work() {
        System.out.println("学打篮球");
    }
}
