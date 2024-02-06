package com.fengxiaoshuai.fightgame;

public class User {
    private String name;
    private int hp;
    private int atk;


    public User() {
    }

    public User(String name, int hp, int atk) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
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
     * @return hp
     */
    public int getHp() {
        return hp;
    }

    /**
     * 设置
     * @param hp
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * 获取
     * @return atk
     */
    public int getAtk() {
        return atk;
    }

    /**
     * 设置
     * @param atk
     */
    public void setAtk(int atk) {
        this.atk = atk;
    }

    public String toString() {
        return "User{name = " + name + ", hp = " + hp + ", atk = " + atk + "}";
    }
}
