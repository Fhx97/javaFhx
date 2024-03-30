package com.fengxiaoshuai.testdemo4;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RedPacket implements Runnable{
    // 红包金额
    static double money = 100;
    // 红包数量
    static int count = 3;
    //  最小红包金额
    static double MIN = 0.01;
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        // 循环
        // 同步代码块
        // 共享数据是否已到末尾
        lock.lock();
        if(count==0){
            // 共享数据到了末尾
            System.out.println(Thread.currentThread().getName()+"没抢到");
        } else{
            // 共享数据没到末尾
            double packet = 0;
            Random r = new Random();
            if(count ==3){
                double bounds = money - (count-1) * MIN;
                packet = r.nextDouble(bounds);
                money = money -packet;
            } else if (count == 2) {
                double bounds = money - MIN;
                packet = r.nextDouble(bounds);
                money = money -packet;
            }else{
                packet = money;
            }
            count--;
            NumberFormat numberFormat = NumberFormat.getInstance();
            numberFormat.setMaximumFractionDigits(2);
            String outputNumber = numberFormat.format(packet);
            System.out.println(Thread.currentThread().getName()+"抢到了"+outputNumber+"元");
        }
        lock.unlock();
    }
}
