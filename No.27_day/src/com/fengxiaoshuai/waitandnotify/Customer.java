package com.fengxiaoshuai.waitandnotify;

public class Customer extends Thread{
    @Override
    public void run() {
        while (true){
            synchronized (Desk.lock){
                if(Desk.count==0){
                    break;
                }else{
                    if(Desk.foodFlag == 0){
                        try {
                            // 让当前线程跟锁进行绑定
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else{
                        Desk.count--;
                        System.out.println(Desk.count);
                        Desk.lock.notifyAll();
                        Desk.foodFlag = 0;
                    }
                }
            }

        }
    }
}
