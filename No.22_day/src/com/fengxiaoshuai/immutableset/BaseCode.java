package com.fengxiaoshuai.immutableset;

import java.util.*;

public class BaseCode {
    // 不可变集合:不可以被修改的集合
    // 如果某个数据不能被修改,把它防御性地拷贝到不可变集合中是个很好的实践
    // 当集合对象被不可信的库调用时,不可变形式是安全的
    public static void main(String[] args) {
        // 集合一旦创建 无法修改
        // List不可变集合
        List<String> list = List.of("丰小帅", "丰中帅", "丰大帅");
        System.out.println(list);
        System.out.println(list.get(1));
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        // Set不可变集合,无索引且元素唯一
        Set<String> set = Set.of("青山", "绿水");
        for (String s : set) {
            System.out.println(s);
        }
        // Map不可变集合,key不可重复,Map最多最能传递10个键值对(20个参数)
        // 如果要传递多个键值对,把键值对作为一个整体entry进行传递
        Map<String, String> map = Map.of("丰小帅", "北京", "丰中帅", "上海", "丰大帅", "杭州");
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key+" "+ map.get(key));
        }

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry);
        }
    }

}
