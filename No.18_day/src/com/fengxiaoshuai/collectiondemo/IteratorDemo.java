package com.fengxiaoshuai.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    // 迭代器在Java中的类是Iterator,迭代器是集合专用的遍历方式。

    // 报错NoSuchElementException
    // 迭代器遍历完毕,指针不会复位
    // 循环中只能用一次next方法
    // 迭代器遍历时,不能用集合的方法进行增加或删除(只能用迭代器提供的remove方法进行删除)
    public static void main(String[] args) {
        // 创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("fff");
        coll.add("hhh");
        coll.add("xxx");
        coll.add("fhx");
        // 获取迭代器对象
        // 迭代器对象好比一个箭头,默认指向集合的0索引处。
        Iterator<String> it = coll.iterator();
        while (it.hasNext()){
            // next方法:获取元素并移动指针。
            String str = it.next();
            System.out.println(str);
        }

    }

}
