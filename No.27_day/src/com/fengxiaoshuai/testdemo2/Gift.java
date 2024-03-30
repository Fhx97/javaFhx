package com.fengxiaoshuai.testdemo2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Gift extends Thread{
    public static int gifts = 0;
    Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true){
            lock.lock();
            try {
                if (gifts >= 90){
                    System.out.println("剩余10件礼品，不予发放！");
                    break;
                }else {
                    gifts++;
                    System.out.println(getName()+"正在发第"+gifts+"件礼品，还剩"+(100-gifts)+"礼品");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
    }
}
