package com.fengxiaoshuai.genericsdemo;

public class LihuaCat extends Cat{
    @Override
    public void eat(){
        System.out.println("一直叫做"+getName()+"的，"+getAge()+"岁的狸花猫，正在吃鱼！");
    }
}
