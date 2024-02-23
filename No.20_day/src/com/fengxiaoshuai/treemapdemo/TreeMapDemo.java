package com.fengxiaoshuai.treemapdemo;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapDemo {
    // TreeMap
    // TreeMap跟TreeSet底层原理一样,都是红黑树结构的
    // 由键决定特性:不重复、无索引、可排序(对键进行排序)
    // 默认按照键的从小到大进行排序,也可自定义键的排序规则

    // 可通过实现Comparable接口指定比较规则
    // 也可在创建集合时传递Comparator比较器对象指定比较规则

    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        treeMap.put(1,"苹果");
        treeMap.put(3,"梨子");
        treeMap.put(2,"香蕉");
        treeMap.put(4,"橙子");
        System.out.println(treeMap);


    }
}
