package com.fengxiaoshuai.testdemo3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class GetNumber extends Thread{
    Lock lock = new ReentrantLock();
    static int number = 0;
    @Override
    public void run() {
        super.run();
        while (true){
            number++;
            lock.lock();
            try {
                if (number > 100){
                    break;
                }else {
                    if (number % 2 != 0) {
                        System.out.println(getName() + ":" + number);
                    }
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }

        }
    }
}
