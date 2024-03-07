package com.fengxiaoshuai.streamdemo;

import java.util.ArrayList;

public class StreamDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张三丰");
        list.add("张三");
//        ArrayList<String> list1 = new ArrayList<>();
//        for (int i = 0; i < list.size(); i++) {
//            String name = list.get(i);
//            if (name.substring(0,1).equals("张") && name.length() == 3){
//                list1.add(name);
//            }
//        }
//        for (String string : list1) {
//            System.out.println(string);
//        }
    list.stream().filter(name -> name.startsWith("张")).filter(name -> name.length() == 3).forEach(name -> System.out.println(name));
    }
}
