package com.fengxiaoshuai.testdemo5;

import java.util.ArrayList;
import java.util.Collections;

public class RunDemo {
    public static void main(String[] args) {
        ArrayList<Integer> lottery = new ArrayList<>();
        Collections.addAll(lottery,10,5,20,50,100,200,500,800,2,80,300,700);
        Lottery t1 = new Lottery(lottery);
        Lottery t2 = new Lottery(lottery);
        t1.setName("抽奖池1");
        t2.setName("抽奖池2");
        t1.start();
        t2.start();
    }
}
