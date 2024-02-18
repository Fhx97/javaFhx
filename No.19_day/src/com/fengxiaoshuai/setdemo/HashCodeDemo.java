package com.fengxiaoshuai.setdemo;

import java.util.HashSet;

public class HashCodeDemo {
    // HashSet集合底层采取哈希表(哈希表:JDK8之前是由数组和链表组成,JDK8开始由数组、链表和红黑树组成)存储数据
    // 哈希表是一种对于增删改数据性能都较好的结构
    public static void main(String[] args) {
        Student s1 = new Student("丰小帅",28);
        Student s2 = new Student("丰大帅",24);
        Student s3 = new Student("丰中帅",23);
        Student s4 = new Student("丰小帅",28);

        HashSet<Student> hs = new HashSet<>();
        System.out.println(hs.add(s1));
        System.out.println(hs.add(s2));
        System.out.println(hs.add(s3));
        System.out.println(hs.add(s4));
        System.out.println(hs);


    }

}
