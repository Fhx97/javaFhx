package com.fengxiaoshuai.inheritdemo2;

public class Dog {
    private String name;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void drinkWater(){
        System.out.println(getName()+"正在喝水！");
    }

    public void lookHome(){
        System.out.println(getName()+"正在看家！");
    }

    public void eatFood(){
        System.out.println(getName()+"正在吃饭！");
    }


}
