package com.fengxiaoshuai.methodrefer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FuncDemo3 {
    /*引用成员方法
       对象::成员方法
    * */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张三","张三丰");
        // 静态方法中是没有this的
        List<String> collect = list.stream().
                filter(FuncDemo3::lookName).
                collect(Collectors.toList());
        System.out.println(collect);
    }
    public static boolean lookName(String name){
       return name.startsWith("张") && name.length() ==3;
    }
}
