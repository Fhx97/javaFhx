package com.fengxiaoshuai.testdemo4;

import java.util.Random;

public class RunDemo {
    public static void main(String[] args) {
        RedPacket rp = new RedPacket();
        Thread t1 = new Thread(rp);
        Thread t2 = new Thread(rp);
        Thread t3 = new Thread(rp);
        Thread t4 = new Thread(rp);
        Thread t5 = new Thread(rp);
        t1.setName("丰小帅");
        t2.setName("丰中帅");
        t3.setName("丰大帅");
        t4.setName("刘亦菲");
        t5.setName("高圆圆");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
