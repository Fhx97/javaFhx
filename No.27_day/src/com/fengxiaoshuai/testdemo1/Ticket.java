package com.fengxiaoshuai.testdemo1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ticket extends Thread{
    static int ticket = 0;
    static Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true){
            lock.lock();
            try {
                if(ticket == 1000){
                    System.out.println("售罄售罄！");
                    break;
                }else{
                    ticket++;
                    System.out.println(getName()+"正在卖第"+ticket+"张票！");
                    Thread.sleep(30);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }


        }
    }
}
