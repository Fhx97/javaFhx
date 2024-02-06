package com.fengxiaoshuai;

public class ObjectDemo_3 {
    // private关键字:权限修饰符,可以修饰成员(成员变量和成员方法)
    // 被private修饰的成员只能在本类中才能访问
    // 保证数据的安全性



    private int age;
    // set(赋值):给成员变量赋值
    public void setAge(int age){
        if(age>=18 && age <=30){
            // 局部变量表示测试类中调用方法传递过来的数据
            // 等号左边表示成员位置的age
            this.age = age;
        }else{
            System.out.println("不太合适啊！！！");
        }
    }

    // get(获取):对外提供成员变量的值
    public int getAge(){
        return age;
    }

}
