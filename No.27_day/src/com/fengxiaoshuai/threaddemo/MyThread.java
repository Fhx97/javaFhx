package com.fengxiaoshuai.threaddemo;

import javax.xml.transform.Source;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "你好，丰小帅！");
        }
    }
}
