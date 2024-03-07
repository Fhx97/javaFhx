package com.fengxiaoshuai.methodrefer;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FuncDemo8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"丰小帅,18","丰大帅,28");
        ArrayList<String> ls = new ArrayList<>();
        list.stream()
                .map(Student::new)
                .forEach(s -> ls.add(s.getName()));
        System.out.println(ls);

    }
}
