package com.fengxiaoshuai;

public class UserDemo {
    // 标准Javabean类：alt + insert 或者 右键-->Generate
    // 插件PTG:1秒生成Javabean
    private String name;
    private String sex;
    private String email;
    private int age;


    public UserDemo() {
    }

    public UserDemo(String name, String sex, String email, int age) {
        this.name = name;
        this.sex = sex;
        this.email = email;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "UserDemo{name = " + name + ", sex = " + sex + ", email = " + email + ", age = " + age + "}";
    }
}
