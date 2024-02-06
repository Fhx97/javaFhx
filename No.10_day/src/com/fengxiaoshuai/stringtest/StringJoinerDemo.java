package com.fengxiaoshuai.stringtest;

import java.util.StringJoiner;

public class StringJoinerDemo {
    // StringJoiner也可以看成一个容器,创建之后的内容是可变的
    //
    public static void main(String[] args) {
        StringJoiner str_sj = new StringJoiner(",","[","]");
        // 添加元素
        str_sj.add("fff").add("hhh").add("xxx");
        System.out.println(str_sj);
        System.out.println(str_sj.length());
    }
}
