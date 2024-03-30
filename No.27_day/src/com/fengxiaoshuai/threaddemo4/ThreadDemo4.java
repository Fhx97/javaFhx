package com.fengxiaoshuai.threaddemo4;

public class ThreadDemo4 {
    /*
    * 三个卖票窗口,共100张票
    * 线程执行具有随机性
    * 把操作共享数据的代码锁起来
    * */
    public static void main(String[] args) {
        MyThread mc1 = new MyThread();
        MyThread mc2 = new MyThread();
        MyThread mc3 = new MyThread();
        mc1.setName("丰小帅");
        mc2.setName("丰中帅");
        mc3.setName("丰大帅");
        mc1.start();
        mc2.start();
        mc3.start();

    }
}
