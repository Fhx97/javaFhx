package com.fengxiaoshuai.methodrefer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FuncDemo7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"丰小帅,18","丰大帅,28");
        Object[] arr = list.stream()
                .map(Student::new)
                .toArray();
        System.out.println(Arrays.toString(arr));
    }
}
