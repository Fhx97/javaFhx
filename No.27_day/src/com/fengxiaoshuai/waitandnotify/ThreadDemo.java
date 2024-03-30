package com.fengxiaoshuai.waitandnotify;

public class ThreadDemo {
    /*
    * 完成生产者和消费者(等待唤醒机制)的代码
    * 实现线程轮流交替执行的效果
    *
    * */
    public static void main(String[] args) {
        Cook cook = new Cook();
        Customer customer = new Customer();
        cook.setName("生产者");
        customer.setName("消费者");
        cook.start();
        customer.start();
    }

}
