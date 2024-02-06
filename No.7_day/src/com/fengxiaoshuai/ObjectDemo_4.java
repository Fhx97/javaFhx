package com.fengxiaoshuai;

public class ObjectDemo_4 {
    private String name;
    private String password;
    private String password_ver;
    private String email;
    private String sex;
    private int age;

    // 空参构造方法
    public ObjectDemo_4(){
        System.out.println("空参构造方法！！！");
    }
    // 带全参构造方法
    public ObjectDemo_4(String name,String password,String password_ver,String email,String sex,int age){
        this.name = name;
        this.password = password;
        this.password_ver = password_ver;
        this.email = email;
        this.sex = sex;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }

    public void setPassword_ver(String password_ver){
        this.password_ver = password_ver;
    }
    public String getPassword_ver(){
        return password_ver;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }

    public void setSex(String sex){
        this.sex = sex;
    }
    public String getSex(){
        return sex;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

}
