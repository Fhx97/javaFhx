package com.fengxiaoshuai.waitandnotify1;

import java.util.concurrent.ArrayBlockingQueue;

public class ThreadDemo {
    /*
    * 利用阻塞队列完成生产者和消费者(等待唤醒机制)的代码
    * 生产者和消费者必须使用同一个阻塞队列
    * */
    public static void main(String[] args) {
        // 在测试类创建阻塞队列
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);
        Cook cook = new Cook(queue);
        Customer customer = new Customer(queue);
        cook.start();
        customer.start();


    }
}
