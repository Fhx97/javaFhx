package com.fengxiaoshuai.inheritdemo3;

public class TestDemo {
    public static void main(String[] args) {
        Cook cook = new Cook("001","丰小帅",8888.88);
        cook.work();
        cook.eat();

        Manager manager = new Manager("002","丰大帅",18000.0,888.88);
        manager.work();
        manager.eat();


    }
}
