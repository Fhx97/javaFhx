package com.fengxiaoshuai;

public class ObjectDemo4Test {
    public static void main(String[] args) {
        ObjectDemo_4 t = new ObjectDemo_4("丰小帅","fhx666666","fhx666666","fengxiaoshuai@qq.com","大老爷们",18);
        System.out.println("用户名："+t.getName());
        System.out.println("密码："+t.getPassword());
        System.out.println("确认密码："+t.getPassword_ver());
        System.out.println("邮箱："+t.getEmail());
        System.out.println("性别："+t.getSex());
        System.out.println("年龄："+t.getAge());

    }
}
