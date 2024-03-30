package com.fengxiaoshuai.testdemo1;

public class RunDemo {
    public static void main(String[] args) {
        Ticket t1 = new Ticket();
        Ticket t2 = new Ticket();
        t1.setName("丰小帅");
        t2.setName("丰大帅");
        t1.start();
        t2.start();
    }
}
