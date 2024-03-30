package com.fengxiaoshuai.testdemo6;

import java.util.ArrayList;
import java.util.Collections;

public class RunDemo {
    public static void main(String[] args) {
        ArrayList<Integer> lottery = new ArrayList<>();
        Collections.addAll(lottery,10,5,20,50,100,200,500,800,2,80,300,700);
        com.fengxiaoshuai.testdemo6.Lottery t1 = new Lottery(lottery);
        com.fengxiaoshuai.testdemo6.Lottery t2 = new Lottery(lottery);
        com.fengxiaoshuai.testdemo6.Lottery t3 = new Lottery(lottery);
        com.fengxiaoshuai.testdemo6.Lottery t4 = new Lottery(lottery);
        t1.setName("抽奖池1");
        t2.setName("抽奖池2");
        t3.setName("抽奖池3");
        t4.setName("抽奖池4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
