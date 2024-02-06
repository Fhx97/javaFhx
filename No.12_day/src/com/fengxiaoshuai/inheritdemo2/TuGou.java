package com.fengxiaoshuai.inheritdemo2;

public class TuGou extends Dog{
    @Override
    public void eatFood(){
        System.out.println(getName()+"正在吃剩饭！");
    }
}
