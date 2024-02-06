package com.fengxiaoshuai.ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame {
    // RegisterJFrame 注册主界面
    // 以后跟注册相关的代码都写在这里
    public RegisterJFrame(){
        this.setSize(488,500);
        // 设置游戏界面的标题
        this.setTitle("欢迎注册小帅拼图");
        // 设置界面置顶
        this.setAlwaysOnTop(true);
        // 设置界面居中
        this.setLocationRelativeTo(null);
        // 设置游戏的关闭模式
        this.setDefaultCloseOperation(3);
        // 将图形化界面显示
        this.setVisible(true);
    }
}
