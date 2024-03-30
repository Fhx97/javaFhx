package com.fengxiaoshuai.threaddemo5;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyRunable implements Runnable{
    int ticket = 0;
    static Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true){
            lock.lock();
//            synchronized (MyRunable.class){
            try {
                if (ticket < 100) {
                    ticket++;
                    System.out.println(Thread.currentThread().getName() + "正在卖" + ticket + "张票");
                } else {
                    System.out.println("售罄售罄！");
                    return;
    //            }
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
    }
}
