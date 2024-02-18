package com.fengxiaoshuai.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;

public class BaseCode {
    // List系列集合:添加的元素是有序、可重复、有索引。
    // Set系列集合:添加的元素是无序、不重复、无索引。
    // Collection是单列集合的祖宗接口,它的功能是全部单列集合都可以继承使用的。
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        // 添加元素
        // 往List系列集合中添加数据
        // 方法永远返回true,因为List系列是运行元素重复的。

        // 往Set系列集合中添加数据
        // 如果当前要添加的元素不存在,方法返回true，表示添加成功。
        // 如果当前要添加的元素已经存在,方法返回false,表示添加失败。
        // 因为Set系列的集合不允许重复。
        coll.add("fhx");
        coll.add("fff");
        coll.add("xxx");
        System.out.println(coll);

        // 清空元素
        // coll.clear();
        // System.out.println(coll);

        // 删除某个元素
        // 引用Collection里面定义的是共性方法,所以此时不能通过索引进行删除,只能通过元素的对象进行删除。
        // 方法会返回一个布尔值,删除成功返回true,删除失败返回false。
        coll.remove("fff");
        System.out.println(coll);

        // 判断是否包含
        // 底层依赖的是equals方法进行判断是否存在。
        // 如果集合中存储的自定义对象,也想通过contains方法判断是否包含,那么在javabean类一定要重写equals方法。
        System.out.println(coll.contains("fhx"));

        //判断集合是否为空
        System.out.println(coll.isEmpty());

        // 获取集合的长度
        System.out.println(coll.size());
    }
}
