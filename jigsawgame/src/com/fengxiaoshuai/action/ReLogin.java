package com.fengxiaoshuai.action;

import com.fengxiaoshuai.ui.GameJFrame;

import javax.swing.*;

public class ReLogin implements IAction{

    @Override
    public void action(GameJFrame jFrame, JMenuItem item) {
        System.out.println("重新游戏");
        // 再次打乱二维数组中的数据
//        randomImage();
//        // 计步器清零
//        step = 0;
//        // 重新加载图片
//        initImage();
    }
}
