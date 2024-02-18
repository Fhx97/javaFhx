package com.fengxiaoshuai.listdemo;

import java.util.ArrayList;
import java.util.List;

public class RemoveDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        // 通过索引删除
        list.remove(1);
        System.out.println(list);
        // 手动装箱,手动把基本数据类型的1编程Integer类型
        Integer i = Integer.valueOf(1);
        list.remove(i);
        System.out.println(i);

    }
}
