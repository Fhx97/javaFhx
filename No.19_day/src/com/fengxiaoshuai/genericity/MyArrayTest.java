package com.fengxiaoshuai.genericity;

public class MyArrayTest {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("fff");
        list.add("hhh");
        list.add("xxx");
        System.out.println(list);
    }
}
