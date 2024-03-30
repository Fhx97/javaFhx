package com.fengxiaoshuai.threaddemo1;

public class MyRun implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"风轻云淡");
        }
    }
}
