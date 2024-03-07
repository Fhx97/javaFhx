package com.fengxiaoshuai.methodrefer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FuncDemo2 {
    /*引用静态方法
    Integer::parseInt
    * */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"1","2","3","4","5");
        List<Integer> collect = list.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(collect);
    }
}
