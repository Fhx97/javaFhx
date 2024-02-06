package com.fengxiaoshuai.stringdemo;

import java.util.Scanner;

public class UserLoginTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserInfo[] arr = new UserInfo[4];
        UserInfo user_1 = new UserInfo("丰小帅","123456");
        UserInfo user_2 = new UserInfo("丰大帅","654321");
        UserInfo user_3 = new UserInfo("王小五","1234");
        UserInfo user_4 = new UserInfo("赵小六","1234");
        arr[0] = user_1;
        arr[1] = user_2;
        arr[2] = user_3;
        arr[3] = user_4;

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入账户:");
            String name = sc.next();
            System.out.println("请输入密码:");
            String password = sc.next();
            boolean exit_flag = unameVerify(name, arr);
            if (exit_flag) {
                int user_index = getIndex(name, arr);
                if (password.equals(arr[user_index].getPassword())) {
                    System.out.println("恭喜您，登录成功！");
                    break;
                } else {
                    System.out.println("密码错误,请输入正确的密码！");
                }

            } else {
                System.out.println("请输入正确的用户名！");
            }
            System.out.println("您还剩"+(2-i)+"次机会！");

        }
    }
    // 获取用户名是否存在
    public static boolean unameVerify(String name,UserInfo[] arr){
        for (UserInfo userInfo : arr) {
            if (userInfo.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    // 获取用户名所在索引
    public static int getIndex(String name,UserInfo[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getName().equals(name)){
                return i;
            }
        }
        return -1;
    }


}
