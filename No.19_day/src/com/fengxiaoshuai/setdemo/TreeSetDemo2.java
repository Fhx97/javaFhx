package com.fengxiaoshuai.setdemo;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        // o1:表示当前要添加的元素
        // 02:表示已经在红黑树存在的元素
        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 按照长度排序
                int i = o1.length() - o2.length();
                i = i ==0 ? o1.compareTo(o2) : i;
                return i;
            }
        });
        ts.add("f");
        ts.add("fh");
        ts.add("hx");
        ts.add("fhxx");


        System.out.println(ts);

    }
}
