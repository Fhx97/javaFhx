package com.fengxiaoshuai.inheritdemo;

public class Animals {
    private String name;

    public Animals() {
    }

    public Animals(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Animals{name = " + name + "}";
    }

    public void eatFood(){
        System.out.println(name+"正在吃饭！");
    }

    public void drinkWater(){
        System.out.println(name+"正在喝水！");
    }
}
