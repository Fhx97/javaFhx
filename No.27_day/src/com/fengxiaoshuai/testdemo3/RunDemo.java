package com.fengxiaoshuai.testdemo3;

public class RunDemo {
    public static void main(String[] args) {
        GetNumber boy = new GetNumber();
        GetNumber girl = new GetNumber();
        boy.setName("小帅");
        girl.setName("小美");
        boy.start();
        girl.start();
    }
}
