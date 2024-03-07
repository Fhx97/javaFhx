package com.fengxiaoshuai.streamdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamDemo3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7,8,9,10);
        List<Integer> list1 = list.stream()
                .filter(s -> s % 2 == 0)
                .toList();
        System.out.println(list1);
    }
}
