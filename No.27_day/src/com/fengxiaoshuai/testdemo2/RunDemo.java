package com.fengxiaoshuai.testdemo2;

public class RunDemo {
    public static void main(String[] args) {
        Gift boy = new Gift();
        Gift girl = new Gift();
        boy.setName("小帅");
        girl.setName("小美");
        boy.start();
        girl.start();
    }
}
