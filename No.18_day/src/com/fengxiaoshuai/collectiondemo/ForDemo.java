package com.fengxiaoshuai.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;

public class ForDemo {
    // 增强for的底层就是迭代器,为了简化迭代器的代码写的
    // 所有的单列集合和数组才能用增强for进行遍历
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("fff");
        coll.add("hhh");
        coll.add("xxx");
        coll.add("fhx");
        for (String s : coll){
            System.out.println(s);
        }
    }

}
