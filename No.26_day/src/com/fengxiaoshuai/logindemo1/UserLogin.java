package com.fengxiaoshuai.logindemo1;

import cn.hutool.core.io.file.FileReader;

import java.util.List;
import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        FileReader fr = new FileReader("C:\\Users\\丰小帅\\Desktop\\Java\\No.26_day\\output\\user.txt");
        List<String> users = fr.readLines();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请您输入用户名：");
            String name = sc.next();
            System.out.println("请您输入密码：");
            String password = sc.next();
            if(users.contains("name="+name+"&password="+password)){
                System.out.println("恭喜您来到丰小帅的世界！");
                return;
            }

        }
    }
}
