package com.fengxiaoshuai.methodrefer;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class FuncDemo5 {
    /*使用类名引用成员方法
     String::substring
    * */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"aaa","bbb","ccc","ddd");
        list.stream()
                .map(String::toUpperCase)
                .forEach(s -> System.out.println(s));
    }
}
