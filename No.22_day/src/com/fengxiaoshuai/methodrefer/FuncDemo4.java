package com.fengxiaoshuai.methodrefer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FuncDemo4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"丰小帅,18","丰中帅,19","丰大帅,20");
        List<Student> collect = list.stream()
                .map(Student::new)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
