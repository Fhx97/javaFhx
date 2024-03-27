package com.fengxiaoshuai.action;

import com.fengxiaoshuai.ui.GameJFrame;
import com.fengxiaoshuai.ui.LoginJFrame;

import javax.swing.*;

public class ReStartGame implements IAction{

    @Override
    public void action(GameJFrame jFrame, JMenuItem item) {
        System.out.println("重新登录");
        //关闭当前游戏界面
        jFrame.setVisible(false);
        // 打开登录界面
        new LoginJFrame();
    }
}
