package com.fengxiaoshuai.CloneDemo;

import java.util.StringJoiner;

// Cloneable是一个标记线接口
// 现在Cloneable表示一旦实现了,那么当前对象就可以被克隆
// 如果没有实现,当前类的对象就不能克隆

public class User implements Cloneable{
    private int id;
    private String username;
    private String password;
    private String path;
    private int[] data;

    public User() {
    }

    public User(int id, String username, String password, String path, int[] data) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.path = path;
        this.data = data;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return path
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取
     * @return data
     */
    public int[] getData() {
        return data;
    }

    /**
     * 设置
     * @param data
     */
    public void setData(int[] data) {
        this.data = data;
    }

    public String toString() {
        return "User{id = " + id + ", username = " + username + ", password = " + password + ", path = " + path + ", data = " + arrToString()+ "}";
    }

    public String arrToString(){
        StringJoiner sj = new StringJoiner(",","[","]");
        for (int i = 0; i < data.length; i++) {
            sj.add(data[i]+"");
        }
        return  sj.toString();
    }

    @Override
    public User clone() {
        try {

            // 先把被克隆对象中的数组获取出来
            int[] data = this.data;
            // 创建新的数组
            int[] newData = new int[data.length];
            // 拷贝数组中的数据
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            // 调用父类中的方法克隆对象
            User clone = (User) super.clone();
            // 因为父类中的克隆方法是浅克隆,替换克隆出来对象中的地址值
            clone.data = newData;

            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
