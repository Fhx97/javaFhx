package com.fengxiaoshuai.abstractclass;

public class Sheep extends AbstractDemo{
    public Sheep(){};
    public Sheep(String name,int age){
        super(name,age);
    }
    @Override
    public void eat(){
        System.out.println("吃草");
    }

}
