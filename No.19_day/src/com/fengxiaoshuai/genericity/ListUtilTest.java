package com.fengxiaoshuai.genericity;

import java.util.ArrayList;

public class ListUtilTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ListUtil.addAll(list,"fhx");
        System.out.println(list);
    }
}
