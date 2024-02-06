package com.fengxiaoshuai.newstudentsystem;

public class BaseInfo {
    private String user;
    private String password;
    private String ver_id;
    private String phone;

    public BaseInfo() {
    }

    public BaseInfo(String user, String password, String ver_id, String phone) {
        this.user = user;
        this.password = password;
        this.ver_id = ver_id;
        this.phone = phone;
    }

    /**
     * 获取
     * @return user
     */
    public String getUser() {
        return user;
    }

    /**
     * 设置
     * @param user
     */
    public void setUser(String user) {
        this.user = user;
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
     * @return ver_id
     */
    public String getVer_id() {
        return ver_id;
    }

    /**
     * 设置
     * @param ver_id
     */
    public void setVer_id(String ver_id) {
        this.ver_id = ver_id;
    }

    /**
     * 获取
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString() {
        return "BaseInfo{user = " + user + ", password = " + password + ", ver_id = " + ver_id + ", phone = " + phone + "}";
    }
}
