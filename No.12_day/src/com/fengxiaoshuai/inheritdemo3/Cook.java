package com.fengxiaoshuai.inheritdemo3;

public class Cook extends Person{
    public Cook(){}
    public Cook(String id,String name,Double money){
        super(id,name,money);
    }
    @Override
    public void work(){
        System.out.println(getName()+"正在炒菜！");
    }
}
