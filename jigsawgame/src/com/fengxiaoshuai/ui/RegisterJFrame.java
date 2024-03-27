package com.fengxiaoshuai.ui;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.file.FileWriter;
import com.fengxiaoshuai.domain.User;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

public class RegisterJFrame extends JFrame implements MouseListener {

    ArrayList<User> allUsers;
    //提升三个输入框的变量的作用范围，让这三个变量可以在本类中所有方法里面可以使用。
    JTextField username = new JTextField();
    JTextField password = new JTextField();
    JTextField rePassword = new JTextField();

    //提升两个按钮变量的作用范围，让这两个变量可以在本类中所有方法里面可以使用。
    JButton submit = new JButton();
    JButton reset = new JButton();


    public RegisterJFrame(ArrayList<User> allUsers) {
        this.allUsers = allUsers;
        initFrame();
        initView();
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == submit){
            // 点击了注册按钮
            // 用户名、密码不能为空
            if(username.getText().length() == 0 || password.getText().length() == 0 || rePassword.getText().length() == 0){
                showDialog("用户名和密码不能为空");
                return;
            }
            // 判断两次密码输入是否一致
            if(!password.getText().equals(rePassword.getText())){
                showDialog("两次密码输入不一致");
                return;
            }
            // 判断用户名和密码格式是否正确
            if(!username.getText().matches("[\u4E00-\u9FA5]{2,3}")){
                showDialog("用户名格式不正确");
                return;
            }
            if(!password.getText().matches("[a-zA-Z0-9]{6}")){
                showDialog("密码格式不正确");
                return;
            }
            // 判断用户名是否已经重复
            if(judgeUserName(username.getText())){
                showDialog("用户名已存在");
                return;
            }
            // 添加用户
            allUsers.add(new User(username.getText(),password.getText()));
            // 写入文件
            String userStr = "name="+username.getText()+"&password="+password.getText();
            try {
                BufferedWriter bw = new BufferedWriter(new java.io.FileWriter("C:\\Users\\丰浩翔\\Desktop\\Java\\jigsawgame\\usersinfo\\user.txt",true));
                bw.newLine();
                bw.write(userStr);
                bw.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            // 提示注册成功
            showDialog("恭喜您,注册成功！");
            // 关闭当前注册界面,打开登录页面
            this.setVisible(false);
            new LoginJFrame();
        } else if (e.getSource() == reset) {
            // 点击重置按钮
            // 清空三个输入框
            username.setText("");
            password.setText("");
            rePassword.setText("");
        }
    }

    public boolean judgeUserName(String username){
        for (User user : allUsers) {
            if(user.getUsername().equals(username)){
                return true;
            }
        }
        return false;
    }
    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == submit) {
            submit.setIcon(new ImageIcon("image/register/注册按下.png"));
        } else if (e.getSource() == reset) {
            reset.setIcon(new ImageIcon("image\\register\\重置按下.png"));
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getSource() == submit) {
            submit.setIcon(new ImageIcon("image\\register\\注册按钮.png"));
        } else if (e.getSource() == reset) {
            reset.setIcon(new ImageIcon("image\\register\\重置按钮.png"));
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    private void initView() {
        //添加注册用户名的文本
        JLabel usernameText = new JLabel(new ImageIcon("image\\register\\注册用户名.png"));
        usernameText.setBounds(85, 135, 80, 20);

        //添加注册用户名的输入框
        username.setBounds(195, 134, 200, 30);

        //添加注册密码的文本
        JLabel passwordText = new JLabel(new ImageIcon("image\\register\\注册密码.png"));
        passwordText.setBounds(97, 193, 70, 20);

        //添加密码输入框
        password.setBounds(195, 195, 200, 30);

        //添加再次输入密码的文本
        JLabel rePasswordText = new JLabel(new ImageIcon("image\\register\\再次输入密码.png"));
        rePasswordText.setBounds(64, 255, 95, 20);

        //添加再次输入密码的输入框
        rePassword.setBounds(195, 255, 200, 30);

        //注册的按钮
        submit.setIcon(new ImageIcon("image\\register\\注册按钮.png"));
        submit.setBounds(123, 310, 128, 47);
        submit.setBorderPainted(false);
        submit.setContentAreaFilled(false);
        submit.addMouseListener(this);

        //重置的按钮
        reset.setIcon(new ImageIcon("image\\register\\重置按钮.png"));
        reset.setBounds(256, 310, 128, 47);
        reset.setBorderPainted(false);
        reset.setContentAreaFilled(false);
        reset.addMouseListener(this);

        //背景图片
        JLabel background = new JLabel(new ImageIcon("image\\register\\background.png"));
        background.setBounds(0, 0, 470, 390);

        this.getContentPane().add(usernameText);
        this.getContentPane().add(passwordText);
        this.getContentPane().add(rePasswordText);
        this.getContentPane().add(username);
        this.getContentPane().add(password);
        this.getContentPane().add(rePassword);
        this.getContentPane().add(submit);
        this.getContentPane().add(reset);
        this.getContentPane().add(background);
    }

    private void initFrame() {
        //对自己的界面做一些设置。
        //设置宽高
        setSize(488, 430);
        //设置标题
        setTitle("拼图游戏 V1.0注册");
        //取消内部默认布局
        setLayout(null);
        //设置关闭模式
        setDefaultCloseOperation(3);
        //设置居中
        setLocationRelativeTo(null);
        //设置置顶
        setAlwaysOnTop(true);
    }

    //只创建一个弹框对象
    JDialog jDialog = new JDialog();
    //因为展示弹框的代码，会被运行多次
    //所以，我们把展示弹框的代码，抽取到一个方法中。以后用到的时候，就不需要写了
    //直接调用就可以了。
    public void showDialog(String content){
        if(!jDialog.isVisible()){
            //把弹框中原来的文字给清空掉。
            jDialog.getContentPane().removeAll();
            JLabel jLabel = new JLabel(content);
            jLabel.setBounds(0,0,200,150);
            jDialog.add(jLabel);
            //给弹框设置大小
            jDialog.setSize(200, 150);
            //要把弹框在设置为顶层 -- 置顶效果
            jDialog.setAlwaysOnTop(true);
            //要让jDialog居中
            jDialog.setLocationRelativeTo(null);
            //让弹框
            jDialog.setModal(true);
            //让jDialog显示出来
            jDialog.setVisible(true);
        }
    }
}
