package com.fengxiaoshuai.setdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class SetDemo1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        // 如果元素重复添加,则返回false
        boolean r1 = set.add("fhx");
        System.out.println(r1);
        boolean r2 = set.add("fhx");
        System.out.println(r2);
        System.out.println(set);

        set.add("fff");
        set.add("hhh");
        set.add("xxx");
        // Set集合三种遍历方式
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        for (String string : set) {
            System.out.println(string);
        }
        set.forEach(s -> System.out.println(s));


    }
}
