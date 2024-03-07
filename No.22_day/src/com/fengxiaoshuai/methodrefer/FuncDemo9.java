package com.fengxiaoshuai.methodrefer;

import java.util.ArrayList;
import java.util.Collections;

public class FuncDemo9 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"丰小帅,18","丰大帅,28");
        ArrayList<String> ls = new ArrayList<>();
        list.stream()
                .map(Student::new)
                .forEach(s -> ls.add(s.getName()+"-"+s.getAge()));
        System.out.println(ls);

    }
}
