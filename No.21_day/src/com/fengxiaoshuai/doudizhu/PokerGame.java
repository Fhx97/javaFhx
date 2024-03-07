package com.fengxiaoshuai.doudizhu;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {
    // 准备牌
    // 静态代码块:随着类的加载而加载,而且只执行一次
    // 牌盒
    static ArrayList<String> list = new ArrayList<>();
    static{
        String[] color = {"♠","♣","♥","♦"};
        String[] number = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        for (String c : color) {
            // 以此挑选每个花色
            for (String n : number) {
                list.add(c+n);
            }
        }
        Collections.addAll(list,"小王","大王");
    }

    public PokerGame(){
        // 洗牌
        Collections.shuffle(list);
        // 发牌
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String card = list.get(i);
            if(i <= 2){
                lord.add(card);
                continue;
            }
            if(i % 3 == 0){
                player1.add(card);
            }else if(i % 3 == 1){
                player2.add(card);
            }else{
                player3.add(card);
            }
        }

        // 看牌
        lookPoker("底牌",lord);
        lookPoker("小帅",player1);
        lookPoker("中帅",player2);
        lookPoker("大帅",player3);

    }

    public void lookPoker(String name,ArrayList<String> list){
        /* name:玩家名称
        *  list:每位玩家的牌*/
        System.out.print(name+"：");
        for (String poker : list) {
            System.out.print(poker+" ");
        }
        System.out.println();
    }
}
