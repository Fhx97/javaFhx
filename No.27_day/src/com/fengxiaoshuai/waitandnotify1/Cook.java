package com.fengxiaoshuai.waitandnotify1;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread{
    ArrayBlockingQueue<String> queue;
    public Cook(ArrayBlockingQueue<String> queue){
        this.queue = queue;
    }
    @Override
    public void run() {
        while (true){
            try {
                queue.put("小帅");
                System.out.println("小帅来了");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
