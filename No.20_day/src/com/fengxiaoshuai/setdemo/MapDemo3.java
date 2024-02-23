package com.fengxiaoshuai.setdemo;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class MapDemo3 {
    public static void main(String[] args) {
        Map<String,String> m = new HashMap<>();
        m.put("韦小宝","沐剑屏");
        m.put("杨过","小龙女");
        String v1 = m.put("郭靖","黄蓉");

//        Set<Map.Entry<String,String>> entries = m.entrySet();
//        for (Map.Entry<String, String> entry : entries) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }

//        Set<Map.Entry<String,String>> entries = m.entrySet();
//        Iterator<Map.Entry<String,String>> it = entries.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

        Set<Map.Entry<String,String>> entries = m.entrySet();
        entries.forEach(new Consumer<Map.Entry<String, String>>() {
            @Override
            public void accept(Map.Entry<String, String> stringStringEntry) {
                System.out.println(stringStringEntry);
            }
        });





    }
}
