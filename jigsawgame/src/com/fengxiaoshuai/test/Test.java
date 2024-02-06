package com.fengxiaoshuai.test;

import com.sun.management.GarbageCollectionNotificationInfo;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        // 创建一个游戏的主界面
        JFrame gameJframe = new JFrame();
        gameJframe.setSize(603,680);
        // 将图形化界面显示
        gameJframe.setVisible(true);

        // 创建一个登录界面
        JFrame loginJframe = new JFrame();


        // 创建一个注册页面
        JFrame registerJframe = new JFrame();
        registerJframe.setSize(488,500);
        registerJframe.setVisible(true);

    }
}
