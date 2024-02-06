package com.fengxiaoshuai.test;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyJFrame extends JFrame implements MouseListener {
    // 创建一个按钮对象
    JButton jtb = new JButton("点我啊");
    public MyJFrame(){
        this.setSize(603,680);
        this.setTitle("小帅按钮测试");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        jtb.setBounds(0,0,100,50);
        jtb.addMouseListener(this);
        this.getContentPane().add(jtb);
        this.setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("单击");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("按下不松");

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("松开");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("划入");

    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("划出");

    }
}
