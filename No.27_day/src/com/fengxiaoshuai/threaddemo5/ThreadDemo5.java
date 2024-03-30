package com.fengxiaoshuai.threaddemo5;

public class ThreadDemo5 {
    public static void main(String[] args) {
        MyRunable mr = new MyRunable();
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        Thread t3 = new Thread(mr);
        t1.setName("丰小帅");
        t2.setName("丰中帅");
        t3.setName("丰大帅");
        t1.start();
        t2.start();
        t3.start();
    }
}
