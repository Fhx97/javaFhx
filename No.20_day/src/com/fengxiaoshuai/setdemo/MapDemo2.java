package com.fengxiaoshuai.setdemo;

import java.util.*;
import java.util.function.Consumer;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,String> m = new HashMap<>();
        m.put("韦小宝","沐剑屏");
        m.put("杨过","小龙女");
        String v1 = m.put("郭靖","黄蓉");

//        Set<String> keys = m.keySet();
//        for (String key : keys) {
//            System.out.println(key);
//            String value = m.get(key);
//            System.out.println(key+" = "+value);
//        }


//        Set<String> keys = m.keySet();
//        Iterator<String> it = keys.iterator();
//        while (it.hasNext()){
//            String item = it.next();
//            String value = m.get(item);
//            System.out.println(item +" = "+value);
//        }

        Set<String> keys = m.keySet();
        keys.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s + " = " + m.get(s));
            }
        });
    }
}
