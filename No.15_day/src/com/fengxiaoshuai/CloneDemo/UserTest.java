package com.fengxiaoshuai.CloneDemo;

public class UserTest {
    public static void main(String[] args) {
        // 重写Object中的clone方法;
        // 让javabean类实现Cloneable接口;
        // 创建原对象并调用clone方法即可。
        int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,0};
        User u1 = new User(1,"丰小帅","123","girl",data);
        Object u2 = u1.clone();
        System.out.println(u1);
        System.out.println(u2);

        // Object中的克隆是浅克隆
        int[] arr = u1.getData();
        arr[0] = 100;
        System.out.println(u1);
        System.out.println(u2);


    }
}
