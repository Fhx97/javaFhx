package com.fengxiaoshuai.waitandnotify1;

import java.util.concurrent.ArrayBlockingQueue;

public class Customer extends Thread{
    ArrayBlockingQueue<String> queue;
    public Customer(ArrayBlockingQueue<String> queue){
        this.queue = queue;
    }
    @Override
    public void run() {
        while (true){
            try {
                String boy = queue.take();
                System.out.println(boy);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
