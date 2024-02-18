package com.fengxiaoshuai.listdemo;

import java.util.ArrayList;
import java.util.List;

public class BaseCode {
    // List集合特点
    // 有序:存和取的元素顺序一致
    // 索引:可以通过索引操作元素
    // 可重复:存储的元素可以重复
    // Collect的方法List都继承了
    // List集合因为有索引,所以多了很多索引操作的方法
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("fff");
        list.add("hhh");
        list.add("xxx");
        list.add("fhx");
        System.out.println(list);
        list.add(0,"f");
        System.out.println(list);
        list.set(0,"x");
        System.out.println(list);
        System.out.println(list.get(0));
    }
}
