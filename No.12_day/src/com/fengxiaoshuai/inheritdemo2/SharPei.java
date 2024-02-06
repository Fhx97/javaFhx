package com.fengxiaoshuai.inheritdemo2;

public class SharPei extends Dog {
    @Override
    public void eatFood(){
        System.out.println(getName()+"正在吃狗粮，还有在吃骨头！");
    }
}
