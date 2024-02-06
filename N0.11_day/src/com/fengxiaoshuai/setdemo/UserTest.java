package com.fengxiaoshuai.setdemo;

import java.util.ArrayList;
import java.util.Scanner;

public class UserTest {
    public static void main(String[] args) {
        ArrayList<User> users_list = new ArrayList<>();
        User user_1 = new User("001","丰小帅","1234");
        User user_2 = new User("002","王小五","1234");
        User user_3 = new User("003","赵小六","1234");
        users_list.add(user_1);
        users_list.add(user_2);
        users_list.add(user_3);
        System.out.println("请输入id:");
        Scanner sc = new Scanner(System.in);
        String str_id = sc.next();

        for (int i = 0; i < users_list.size(); i++) {
            User user = users_list.get(i);
            System.out.println(user.getId()+","+user.getUsername()+","+user.getPassword());
        }

        boolean flag = checkID(str_id,users_list);
        System.out.println(flag);
    }
    public static boolean checkID(String str,ArrayList<User> users_list){
        for (int i = 0; i < users_list.size(); i++) {
            if(users_list.get(i).getId().equals(str)){
                return true;
            }
        }
        return false;
    }
}
