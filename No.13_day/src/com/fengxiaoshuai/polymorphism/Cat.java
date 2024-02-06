package com.fengxiaoshuai.polymorphism;

public class Cat extends Animal{
    public Cat(){};
    public Cat(int age,String color){
        super(age,color);
    }

    @Override
    public void eat(String Something){
        System.out.println(getAge()+"岁的"+getColor()+"猫"+Something);
    }

    public void catchMouse(){
        System.out.println("逮老鼠！");
    }


}
