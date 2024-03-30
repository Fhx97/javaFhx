package com.fengxiaoshuai.waitandnotify;

public class Cook extends Thread{
    @Override
    public void run() {
        while (true){
            synchronized (Desk.lock){
                if(Desk.count==0){
                    // 判断共享数据是否到达末尾
                    break;
                }else{
                    if(Desk.foodFlag == 1){
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else{
                        System.out.println("生产者模式操作了一次！");
                        Desk.lock.notifyAll();
                        Desk.foodFlag = 1;
                    }
                }
            }
        }
    }
}
