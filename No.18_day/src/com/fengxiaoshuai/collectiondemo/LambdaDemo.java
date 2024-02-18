package com.fengxiaoshuai.collectiondemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class LambdaDemo {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("fff");
        coll.add("hhh");
        coll.add("xxx");
        coll.add("fhx");
//        coll.forEach(new Consumer<String>() {
//            // s就是依次表示集合中的每个数据
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
        coll.forEach(s -> System.out.println(s));
    }
}
