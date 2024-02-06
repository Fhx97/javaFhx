package com.fengxiaoshuai.abstractclass;

public class Frog extends AbstractDemo{
    public Frog() {
    }
    public Frog(String name,int age){
        super(name,age);
    }

    @Override
    public void eat() {
        System.out.println("吃虫子！");
    }
}
