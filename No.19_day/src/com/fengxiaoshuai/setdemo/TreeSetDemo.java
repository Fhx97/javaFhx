package com.fengxiaoshuai.setdemo;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    // 对于数值类型:Integer,Double,默认按照从小到大的顺序进行排序
    // 对于字符、字符串类型:按照字符在ASCII码表中的数字升序进行排序
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(4);
        ts.add(5);
        System.out.println(ts);
        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
