package com.fengxiaoshuai.testdemo6;

import java.util.ArrayList;
import java.util.Collections;

public class Lottery extends Thread{
    ArrayList<Integer> lottery;
    public Lottery(ArrayList<Integer> lottery){
        this.lottery = lottery;
    }
    @Override
    public void run() {
        ArrayList<Integer> boxList = new ArrayList<>();
        while (true){
            synchronized (Lottery.class){
            if(lottery.size()==0){
                lotteryPrint(getName(),boxList);
                break;
            }else {
                Collections.shuffle(lottery);
                int money = lottery.remove(0);
                boxList.add(money);
            }}}}
    // 线程一所用集合
//    static ArrayList<Integer> list1 = new ArrayList<>();
//    // 线程二所用集合
//    static ArrayList<Integer> list2 = new ArrayList<>();
//
//    @Override
//    public void run() {
//        while (true){
//            synchronized (Lottery.class){
//                if(lottery.size()==0){
//                    if("抽奖池1".equals(getName())){
//                        lotteryPrint(getName(),list1);
//                    }else{
//                        lotteryPrint(getName(),list2);
//                    }
//                    break;
//                }else{
//                    Collections.shuffle(lottery);
//                    int money = lottery.remove(0);
//                    if("抽奖池1".equals(getName())){
//                        list1.add(money);
//                    }else{
//                        list2.add(money);
//                    }
////                    System.out.println(getName()+money);
//                }
//            }
//        }
//    }
    public static void lotteryPrint(String name,ArrayList<Integer> list){
        int count = list.size();
        int sum = 0;
        Collections.sort(list);
        System.out.println("在此次抽奖过程中，"+name+"总共产生了"+count+"个奖项。");
        StringBuilder sb = new StringBuilder();
        if(count!=0){
            for (int i = 0; i < count; i++) {
                sum += list.get(i);
                if(i == count-1){
                    sb.append(list.get(i));
                }else{
                    sb.append(list.get(i)+",");
                }
            }
            System.out.println("分别为：" + sb.toString() +"，最高奖项为" + list.get(count-1)
                    +"元，总计额为"+ sum + "元");
        }else{
            System.out.println("分别为：" +" " +"，最高奖项为0元，总计额为0元");
        }

    }
}
