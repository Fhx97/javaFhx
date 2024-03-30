package com.fengxiaoshuai.testdemo5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Lottery extends Thread{
//    static int[] lottery = {10,5,20,50,100,200,500,800,2,80,300,700};
    ArrayList<Integer> lottery;
    static Lock lock = new ReentrantLock();
    public Lottery(ArrayList<Integer> lottery){
        this.lottery = lottery;
    }

    @Override
    public void run() {
        while (true){
            lock.lock();
//        synchronized (Lottery.class){

            try {
                if(lottery.size()==0){
                    break;
                }else {
                    Collections.shuffle(lottery);
                    int money = lottery.remove(0);
                    System.out.println(getName() + "又产生了" + money + "大奖！");
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }


        }


//    }
}
