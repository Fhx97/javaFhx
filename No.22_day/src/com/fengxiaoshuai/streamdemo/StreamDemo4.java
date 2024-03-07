package com.fengxiaoshuai.streamdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"丰小帅,23","丰中帅,24","丰大帅,25");
        Map<String, String> collect = list.stream()
                .filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
                .collect(Collectors.toMap(s -> s.split(",")[0], s -> s.split(",")[1]));
        System.out.println(collect);
    }
}
