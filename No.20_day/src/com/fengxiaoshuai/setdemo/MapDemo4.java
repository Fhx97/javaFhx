package com.fengxiaoshuai.setdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapDemo4 {
    public static void main(String[] args) {
        Map<String,String> m = new HashMap<>();
        m.put("韦小宝","沐剑屏");
        m.put("杨过","小龙女");
        String v1 = m.put("郭靖","黄蓉");

        m.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + " = " + value);
            }
        });
    }
}
