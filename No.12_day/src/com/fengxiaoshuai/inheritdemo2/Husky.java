package com.fengxiaoshuai.inheritdemo2;

public class Husky extends Dog{
    public void breakHome(){
        System.out.println(getName()+"正在拆家！");
    }

    @Override
    public void eatFood(){
        System.out.println(getName()+"正在吃狗粮！");
    }
}
