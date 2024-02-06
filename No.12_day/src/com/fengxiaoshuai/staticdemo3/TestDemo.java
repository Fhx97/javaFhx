package com.fengxiaoshuai.staticdemo3;

import java.util.ArrayList;

public class TestDemo {
    public static void main(String[] args) {
        ArrayList<Student> arr = new ArrayList<>();
        Student stu1 = new Student("丰小帅",18,"男");
        Student stu2 = new Student("丰中帅",28,"男");
        Student stu3 = new Student("丰大帅",35,"男");
        arr.add(stu1);
        arr.add(stu2);
        arr.add(stu3);
        int maxAge = GetMaxAge.getMaxAge(arr);
        System.out.println(maxAge);

    }
}
