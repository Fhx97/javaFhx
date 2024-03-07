package com.fengxiaoshuai.doudizhu2;

import java.sql.SQLOutput;
import java.util.*;

public class PokerGame {
    // 牌盒
    // 只需将牌盒序号生产对应关系即可
//    static HashMap<Integer,ArrayList<String>> hm = new HashMap<>();
    static HashMap<Integer,String> hm = new HashMap<>();
    static ArrayList<Integer> list = new ArrayList<>();
    static{
        String[] color = {"♠","♥","♣","♦"};
        String[] number = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        int serialNumber = 1;
        for (String n : number) {
            for (String c : color) {
                hm.put(serialNumber,c+n);
                list.add(serialNumber);
                serialNumber++;
            }
        }
        hm.put(serialNumber,"小王");
        list.add(serialNumber);
        serialNumber++;
        hm.put(serialNumber,"大王");
        list.add(serialNumber);
        System.out.println(hm);
//        for (String n : number) {
//            ArrayList<String> pokerList = new ArrayList<>();
//            for (String c : color) {
//                pokerList.add(c+n);
//            }
//            hm.put(serialNumber,pokerList);
//            serialNumber++;
//        }
//        ArrayList<String> littleJoker = new ArrayList<>();
//        littleJoker.add("小王");
//        hm.put(14,littleJoker);
//        ArrayList<String> bigJoker = new ArrayList<>();
//        bigJoker.add("大王");
//        hm.put(15,bigJoker);
    }

    public PokerGame(){
        // 洗牌
        Collections.shuffle(list);
        // 发牌
        ArrayList<Integer> lord = new ArrayList<>();
        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(i<3){
                lord.add(list.get(i));
                continue;
            }
            if(i % 3 == 0){
                player1.add(list.get(i));
            }else if(i % 3 == 1){
                player2.add(list.get(i));
            }else{
                player3.add(list.get(i));
            }
        }
//        System.out.println(lord);
//        System.out.println(player1);
//        System.out.println(player2);
//        System.out.println(player3);
        sendPoker("底牌",transPoker(lord,hm));
        sendPoker("丰小帅",transPoker(player1,hm));
        sendPoker("丰中帅",transPoker(player2,hm));
        sendPoker("丰大帅",transPoker(player3,hm));

    }
    public static ArrayList<String> transPoker(ArrayList<Integer> list, HashMap<Integer,String> hm){
        Collections.sort(list);
        ArrayList<String> poker = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            poker.add(hm.get(list.get(i)));
        }
        return poker;
    }
    public static void sendPoker(String name,ArrayList<String> list){
        StringJoiner sj = new StringJoiner(" ","","");
        for (int i = 0; i < list.size(); i++) {
            sj.add(list.get(i));
        }
        System.out.println(name+"："+sj);
    }
}
