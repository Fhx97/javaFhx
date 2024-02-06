package com.fengxiaoshuai.fightgame;

import java.util.Random;

public class UserOpt {
    private String name;
    private int hp;
    private char gender;
    private String face;
    private String skill;
    private String injured;


    public UserOpt() {
    }

    public UserOpt(String name, int hp, char gender, String face, String skill, String injured) {
        this.name = name;
        this.hp = hp;
        this.gender = gender;
        this.face = face;
        this.skill = skill;
        this.injured = injured;
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
     * @return gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return face
     */
    public String getFace() {
        return face;
    }

    /**
     * 设置
     * @param face
     */
    public void setFace(String face) {
        this.face = face;
    }

    /**
     * 获取
     * @return skill
     */
    public String getSkill() {
        return skill;
    }

    /**
     * 设置
     * @param skill
     */
    public void setSkill(String skill) {
        this.skill = skill;
    }

    /**
     * 获取
     * @return injured
     */
    public String getInjured() {
        return injured;
    }

    /**
     * 设置
     * @param injured
     */
    public void setInjured(String injured) {
        this.injured = injured;
    }

    public String toString() {
        return "UserOpt{name = " + name + ", hp = " + hp + ", gender = " + gender + ", face = " + face + ", skill = " + skill + ", injured = " + injured + "}";
    }

    // 定义攻击特性
    public void attack(UserOpt user){
        Random r = new Random();
        int attack = r.nextInt(20)+1;
        int remain_hp = user.hp - attack;
        user.setHp(remain_hp);
        System.out.println(user.name+"还剩:"+remain_hp+"生命值！");
    }

}
