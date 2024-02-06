package com.fengxiaoshuai.inheritdemo3;

public class Manager extends Person{
    private double manageMoney;

    public Manager(){
    }
    public Manager(String id,String name,Double money,Double manageMoney){
        super(id,name,money);
        this.manageMoney = manageMoney;
    }
    @Override
    public void work(){
        System.out.println(getName()+"正在管理其他人！");
    }

}
