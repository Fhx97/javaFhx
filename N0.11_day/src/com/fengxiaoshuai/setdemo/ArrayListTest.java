package com.fengxiaoshuai.setdemo;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> arr_lsit = new ArrayList<>();
        arr_lsit.add("丰");
        arr_lsit.add("小");
        arr_lsit.add("帅");
        arr_lsit.add("啊");
        for (int i = 0; i < arr_lsit.size(); i++) {
            System.out.println(arr_lsit.get(i));
        }
    }
}
