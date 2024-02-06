package com.fengxiaoshuai.staticdemo;

public class Students {
    private String name;
    private int age;
    private String gender;
    // 加上static表示所有类都共享"teacherName"这一属性
    public static String teacherName;

    public Students() {
    }

    public Students(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void study(){
        System.out.println(name+"正在学习......");
    }

    public void show(){
        System.out.println(name+","+age+","+gender+","+teacherName);
    }
}
