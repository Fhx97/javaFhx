package com.fengxiaoshuai.interfacedemo2;

public class BasketballCoach extends Person{
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("教打篮球");
    }
}
