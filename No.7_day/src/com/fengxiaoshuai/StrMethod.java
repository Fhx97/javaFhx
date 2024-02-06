package com.fengxiaoshuai;

public class StrMethod {
    // 构造方法(构造器、构造函数)
    // 在创建对象时给成员变量进行初始化(赋值)的

    // 方法名与类名相同,大小写也得一致
    // 没有返回值类型,连void都没有
    // 没有具体的返回值(不能由return带回结果的数据)

    // 创建对象的时候由虚拟机调用,不能手动调用构造方法
    // 每创建一次对象,就会调用一次方法
    // 如果没有定义构造方法,系统将给出一个默认的无参数构造方法
    // 如果定义了构造方法,系统将不再提供默认的构造方法
    // 构造方法重载:带参构造方法和无参构造方法二者方法名相同,但参数不同
    // 推荐格式:无论是否使用,都手动书写无参数的构造方法,和带全部参数的构造方法

    // 构造方法只是创建对象的一个步骤
    // 创建对象的时候,虚拟机会自动调用构造方法,作用是给成员变量进行初始化

    private String name;
    private int age;



    // 如果没写构造方法,虚拟机会自动加入一个空参构造方法
    public StrMethod(){
        System.out.println("执行了唉！！！");
     }

    // 有参构造
    public StrMethod(String name,int age){
        this.name = name;
        this.age  = age;
    }


    public void setName(){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public  void setAge(){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

}
