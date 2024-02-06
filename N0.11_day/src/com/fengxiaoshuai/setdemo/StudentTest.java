package com.fengxiaoshuai.setdemo;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> stu_info = new ArrayList<>();
        Student stu_1 = new Student("丰小帅",24);
        Student stu_2 = new Student("丰大帅",18);
        stu_info.add(stu_1);
        stu_info.add(stu_2);
        System.out.println(stu_info);
    }
}
