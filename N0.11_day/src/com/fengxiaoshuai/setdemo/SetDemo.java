package com.fengxiaoshuai.setdemo;

import java.util.ArrayList;

public class SetDemo {
    // 集合:自动扩容,可以寸引用数据类型,但存放基本数据类型需将其包装成类。
    public static void main(String[] args) {
        // 创建集合的对象
        // 泛型:限定集合中存储数据的类型
        // 打印的不是地址值,而是集合中存储的内容,输出结果会用'[]'包裹
        ArrayList<String> arr_list = new ArrayList<>();
        System.out.println(arr_list);

        // 增
        boolean incre_flag = arr_list.add("fengxiaoshuai");
        System.out.println(incre_flag);
        System.out.println(arr_list);
        arr_list.add("fhxxxx");
        arr_list.add("abc");
        arr_list.add("efg");
        arr_list.add("ad");
        arr_list.add("fx");
        System.out.println(arr_list);

        // 删
        arr_list.remove("ad");
        System.out.println(arr_list);
        String str = arr_list.remove(2);
        System.out.println(str);
        System.out.println(arr_list);

        // 改
        String str_1 = arr_list.set(3,"丰大帅");
        System.out.println(str_1);
        System.out.println(arr_list);

        // 查
        System.out.println(arr_list.size());
        System.out.println(arr_list.get(3));



    }
}
