package com.fengxiaoshuai.threaddemo3;

public class ThreadDemo3 {
    public static void main(String[] args) {
        // 抢占式调度:随机

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        /*
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        // 获取main线程优先级1-10(越大抢到CPU资源越大)
        System.out.println(Thread.currentThread().getPriority());
        t1.setPriority(1);
        t2.setPriority(8);
        t1.start();
        t2.start();
        */
        // 当其他的非守护线程执行完毕后,守护线程会陆续结束
        t2.setDaemon(true);
        t1.start();
        t2.start();
    }
}
