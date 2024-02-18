package com.fengxiaoshuai.setdemo;

import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Student s1 = new Student("fff",28);
        Student s2 = new Student("fhx",24);
        Student s3 = new Student("xxx",23);
        TreeSet<Student> ts = new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        System.out.println(ts);
    }
}
