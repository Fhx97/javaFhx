package com.fengxiaoshuai.hashmapdemo;

import java.util.HashMap;

public class HashMapDemo1 {
    public static void main(String[] args) {
        // HashMap底层是哈希表结构的
        // 依赖hashCode方法和equals方法保证键的唯一
        // 如果键存储自定义对象,需重写hashCode和equals方法
        // 如果值存储自定义对象,就不需要重写hashCode和equals方法
        HashMap<Student,String> h = new HashMap<>();
        h.put(new Student("丰小帅",18),"北京");
        h.put(new Student("丰中帅",19),"上海");
        h.put(new Student("丰大帅",20),"广州");
        h.put(new Student("丰小帅",18),"天津");
        System.out.println(h);

    }
}
