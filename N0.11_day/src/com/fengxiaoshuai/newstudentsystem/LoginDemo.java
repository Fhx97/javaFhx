package com.fengxiaoshuai.newstudentsystem;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LoginDemo {
    public static void main(String[] args) {
        ArrayList<BaseInfo> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            int choose = regPag();
            switch (choose) {
                case 1:
                    // 登录
                    for (int i = 0; i < 3; i++) {
                        System.out.println("请输入用户名:");
                        String s_name = sc.next();
                        if (checkName(students, s_name)) {
                            System.out.println("用户未注册，请先注册");
                            break;
                        } else {
                            System.out.println("请输入密码:");
                            String s_password = sc.next();
                            String verify_sta = verifyGen();
                            System.out.println("请输入验证码:" + verify_sta);
                            String verify = sc.next();
                            int password_index = getIndex(students, s_name);
                            if (students.get(password_index).getPassword().equals(s_password)) {
                                while (!verify_sta.toLowerCase().equals(verify.toLowerCase())) {
                                    System.out.println("请您再次输入验证码：");
                                    verify = sc.next();
                                }
                                System.out.println("恭喜您，登录成功！");
                                System.exit(0);
                            } else {
                                System.out.println("密码输入错误！！！");
                                break;
                            }

                        }
                    }

                    break;
                case 2:
                    // 注册
                    System.out.println("请输入用户名：");
                    String user = sc.next();
                    // 检测用户名合法性
                    if (checkLength(user)) {
                        // 用户名唯一性验证
                        if (checkName(students, user)) {
                            // 用户名组成检测
                            if (checkForm(user)) {
                                System.out.println("请输入密码：");
                                String str_1 = sc.next();
                                System.out.println("请再次确认密码");
                                String str_2 = sc.next();
                                if (passwordVerify(str_1, str_2)) {
                                    // 身份证号验证
                                    System.out.println("请输入身份证号：");
                                    String id = sc.next();
                                    if (checkID(id)) {
                                        // 手机号验证
                                        System.out.println("请输入手机号：");
                                        String phone = sc.next();
                                        if (checkPhone(phone)) {
                                            BaseInfo stu = new BaseInfo(user, str_1, id, phone);
                                            students.add(stu);
                                            System.out.println("恭喜您，注册成功！");
                                        } else {
                                            System.out.println("手机号好像不对啊！");
                                        }

                                    } else {
                                        System.out.println("身份证格式非法！");
                                    }
                                } else {
                                    System.out.println("两次输入的密码不一样哟！");
                                }
                            } else {
                                System.out.println("用户名只能由数字和英文字母组成,不能由纯数字构成！");
                            }
                        } else {
                            System.out.println("用户昵称已存在！！！");
                        }

                    } else {
                        System.out.println("用户名长度应为3-15位之间！");
                    }

                    break;
                case 3:
                    // 忘记密码
                    System.out.println("请输入用户名：");
                    String f_name = sc.next();
                    int forget_index = getIndex(students,f_name);
                    if(forget_index == -1){
                        System.out.println("该用户未注册！！！");
                    }else{
                        System.out.println("请输入身份证号：");
                        String f_id = sc.next();
                        System.out.println("请输入手机号码");
                        String f_phone = sc.next();
                        if(students.get(forget_index).getVer_id().equals(f_id) && students.get(forget_index).getPhone().equals(f_phone)){
                            System.out.println("请输入要修改的密码！！！");
                        }else{
                            System.out.println("验证失败，下次继续！！！");
                        }
                    }
                    break;
                default:
                    System.out.println("请输入1-3!!!");
                    break;
            }

        }

    }

    // 默认登录首页
    public static int regPag() {
        System.out.println("欢迎来到小帅学生管理系统");
        System.out.println("请选择操作：1登录 2注册 3忘记密码");
        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();
        return choose;
    }

    // 注册功能
    // 用户名唯一性验证
    public static boolean checkName(ArrayList<BaseInfo> students, String str) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getUser().equals(str)) {
                return false;
            }
        }
        return true;
    }

    // 用户名长度确定
    public static boolean checkLength(String str) {
        if (str.length() >= 3 && str.length() <= 15) {
            return true;
        } else {
            return false;
        }
    }

    // 用户名(字母加数字,不能是纯数字)组成确定
    public static boolean checkForm(String str) {
        char[] name_arr = str.toCharArray();
        // 将0-9以char形式装入数组
        char[] num_arr = new char[10];
        for (int i = 0; i < num_arr.length; i++) {
            num_arr[i] = (char) (48 + i);
        }
        // 定义用户名数字出现的次数
        int count = 0;
        for (int i = 0; i < name_arr.length; i++) {
            for (int j = 0; j < num_arr.length; j++) {
                if (name_arr[i] == num_arr[j]) {
                    count++;
                    break;
                }
            }
        }
        if (count > 0 && count < str.length()) {
            return true;
        } else {
            return false;
        }
    }

    // 两次输入确认
    public static boolean passwordVerify(String str_1, String str_2) {
        if (str_1.equals(str_2)) {
            return true;
        } else {
            return false;
        }
    }

    // 身份证号确认
    public static boolean checkID(String id) {
        if (id.length() != 18) {
            return false;
        }
        char[] num_arr = new char[10];
        for (int i = 0; i < num_arr.length; i++) {
            num_arr[i] = (char) (48 + i);
        }
        char[] id_arr = id.toCharArray();
        if (id_arr[0] == num_arr[0]) {
            return false;
        }
        int count = 0;
        for (int i = 0; i < id_arr.length; i++) {
            for (int j = 0; j < num_arr.length; j++) {
                if (id_arr[i] == num_arr[j]) {
                    count++;
                    break;
                }
            }
        }
        if (count < 17) {
            return false;
        } else if (count == 17) {
            if (id_arr[17] != 'X' && id_arr[17] != 'x') {
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }

    }

    // 手机号验证
    public static boolean checkPhone(String phone) {
        if (phone.length() != 11) {
            return false;
        }
        char[] phone_arr = phone.toCharArray();
        if (phone_arr[0] == '0') {
            return false;
        }
        char[] num_arr = new char[10];
        for (int i = 0; i < num_arr.length; i++) {
            num_arr[i] = (char) (48 + i);
        }
        int count = 0;
        for (int i = 0; i < phone_arr.length; i++) {
            for (int j = 0; j < num_arr.length; j++) {
                if (phone_arr[i] == num_arr[j]) {
                    count++;
                    break;
                }
            }
        }
        if (count < 11) {
            return false;
        }
        return true;
    }

    // 验证码生成
    public static String verifyGen() {
        char[] num_arr = new char[10];
        for (int i = 0; i < num_arr.length; i++) {
            num_arr[i] = (char) (48 + i);
        }
        char[] letter_arr = new char[52];
        for (int i = 0; i < 26; i++) {
            letter_arr[i] = (char) ('a' + i);
        }
        for (int i = 26; i < 52; i++) {
            letter_arr[i] = (char) ('A' + i - 26);
        }
        char[] verify_num = new char[5];
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int letter_index = r.nextInt(52);
            verify_num[i] = letter_arr[letter_index];
        }
        int num_index = r.nextInt(10);
        verify_num[4] = num_arr[num_index];
        int random_index = r.nextInt(5);
        char temp = verify_num[4];
        char t_temp = verify_num[random_index];
        verify_num[random_index] = temp;
        verify_num[4] = t_temp;
        String verify = new String(verify_num);
        return verify;
    }

    // 登录功能
    // 密码确认
    public static int getIndex(ArrayList<BaseInfo> students, String user) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getUser().equals(user)) {
                return i;
            }
        }
        return -1;

    }


}
