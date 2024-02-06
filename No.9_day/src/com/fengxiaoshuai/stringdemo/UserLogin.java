package com.fengxiaoshuai.stringdemo;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        UserInfo[] arr = new UserInfo[4];
        UserInfo user_1 = new UserInfo("丰小帅","123456");
        UserInfo user_2 = new UserInfo("丰大帅","654321");
        UserInfo user_3 = new UserInfo("王小五","1234");
        UserInfo user_4 = new UserInfo("赵小六","1234");
        arr[0] = user_1;
        arr[1] = user_2;
        arr[2] = user_3;
        arr[3] = user_4;
        Scanner sc = new Scanner(System.in);
        outerlooper:
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入账户:");
            String user = sc.next();
            System.out.println("请输入密码:");
            String password = sc.next();

            innerlooper:
            for (int j = 0; j < arr.length; j++) {
                if(arr[j].getName().equals(user)){
                    if(arr[j].getPassword().equals(password)){
                        System.out.println("恭喜您，登录成功！");
                        break outerlooper;
                    }else{
                        System.out.println("密码输入错误！");
                        break innerlooper;
                    }
                }else{
                    System.out.println("请输入正确的用户名！！！");
                    break innerlooper;
                }

            }

        }


    }

}
