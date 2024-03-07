package com.fengxiaoshuai.streamdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamDemo2 {
    // Stream流的作用:结合Lambda表达式,简化集合、数组的操作
    // Stream流使用步骤:先得到一条Stream流,并把数据放上去,在利用Stream流中的API进行各种操作
    /*Stream接口中的静态方法的形参是一个可变参数,可以传递一些零散数据,也可以传递数组,
      但是数组必须是引用数据类型,如果传递基本数据类型,是会把整个数组当做一个元素放到Stream中。
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"钱一","王二","张三","李四","赵五","孙六");
        // filter 过滤
//        list.stream().filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                // 返回结果为true的留下,false则舍弃不要
//                return s.startsWith("张");
//            }
//        }).forEach(s -> System.out.println(s));
        list.stream()
                .filter(s -> s.startsWith("张"))
                .forEach(s -> System.out.println(s));

        // limit 获取前几个元素
        list.stream()
                .limit(3)
                .forEach(s -> System.out.println(s));

        // skip 跳过前几个元素
        list.stream()
                .skip(3)
                .forEach(s -> System.out.println(s));

        // distinct 元素去重(依赖hashCode和equals方法)
        // concat 将两个流合并为一个流
        // map 转换流中的数据类型
        // count 统计
        // toArray 收集数据到数组
        // collect 收集数据到集合中(List Set Map)
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"丰小帅-男-18","丰中帅-男-19","丰大帅-男-20",
                "王小花-女-18","赵小美-女-17");
        List<String> result = list1.stream()
                .filter(s -> s.split("-")[1].equals("男"))
                .collect(Collectors.toList());
        System.out.println(result);
        Map<String, String> map = list1.stream()
                .filter(s -> s.split("-")[1].equals("男"))
                .collect(Collectors.toMap(s -> s.split("-")[0], s -> s.split("-")[2]));
        System.out.println(map);


    }
}
