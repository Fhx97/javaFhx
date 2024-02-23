package com.fengxiaoshuai.linkedhashmap;

import java.util.LinkedHashMap;

public class LinkDemo1 {
    // LinkedHashMap:有序(保证存储和取出的顺序一致)、不重复、无索引。
    // 底层数据结构是哈希表,只是每个键值对元素又额外多了一个双链表的机制记录存储的顺序。
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("丰",18);
        lhm.put("小",19);
        lhm.put("帅",20);
        System.out.println(lhm);
    }
}
