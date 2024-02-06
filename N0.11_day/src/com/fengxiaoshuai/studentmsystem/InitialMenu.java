package com.fengxiaoshuai.studentmsystem;

import com.fengxiaoshuai.setdemo.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class InitialMenu {

    public static void main(String[] args) {
        ArrayList<StudentInfo> student_all = new ArrayList<>();
        boolean flag_label = true;
        while (flag_label){
            int input = initial();
            switch (input) {
                case 1:
                    // 添加学生
                    StudentInfo student = studentAdd();
                    boolean flag = checkID(student_all, student);
                    if (flag) {
                        student_all.add(student);
                        System.out.println(student.getName() + "信息已被成功添加！");
                    } else {
                        System.out.println(student.getId() + "存在重复,无法添加！");
                    }
                    break;
                case 2:
                    // 删除学生
                    int num = studentDel(student_all);
                    if(num==-1){
                        System.out.println("该id不存在");
                    }else{
                        System.out.println(student_all.get(num).getId()+"已被成功删除！");
                        student_all.remove(num);

                    }
                    break;
                case 3:
                    // 修改学生
                    boolean flag_alter = studentAlter(student_all);
                    if(flag_alter){
                        System.out.println("学生信息已经被成功修改！");
                    }else{
                        System.out.println("该id不存在！！！");
                    }
                    break;
                case 4:
                    // 查询学生
                    studentQuery(student_all);
                    break;
                case 5:
                    // 退出
                    flag_label = false;
                    System.out.println("小帅学生管理系统期待与您下次再会！");
                    break;
                default:
                    System.out.println("请输入1-5之间的数字！");
                    break;
            }
        }

    }
    // 初始化页面
    public static int initial() {
        System.out.println("-------------欢迎来到小帅学生管理系统----------------");
        System.out.println("1：添加学生");
        System.out.println("2：删除学生");
        System.out.println("3：修改学生");
        System.out.println("4：查询学生");
        System.out.println("5：退出");
        System.out.println("请输入您的选择:");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;
    }
    // 添加学生
    public static StudentInfo studentAdd() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要添加的学生id:");
        String id = sc.next();
        System.out.println("请输入要添加的学生姓名:");
        String name = sc.next();
        System.out.println("请输入要添加的学生年龄:");
        int age = sc.nextInt();
        System.out.println("请输入要添加的学生家庭住址:");
        String address = sc.next();
        StudentInfo student = new StudentInfo(id, name, age, address);
        return student;
    }
    // 检查ID是否重复
    public static boolean checkID(ArrayList<StudentInfo> arrayList, StudentInfo student) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).getId().equals(student.getId())) {
                return false;
            }
        }
        return true;
    }
    // 删除学生
    public static int studentDel(ArrayList<StudentInfo> student_all){
        System.out.println("请输入要删除的学生id:");
        Scanner sc = new Scanner(System.in);
        String  id = sc.next();
        for (int i = 0; i < student_all.size(); i++) {
            if(student_all.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

    // 修改学生id
    public static boolean studentAlter(ArrayList<StudentInfo> student_all){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生id:");
        String id = sc.next();
        for (int i = 0; i < student_all.size(); i++) {
            if(student_all.get(i).getId().equals(id)){
                System.out.println("请输入学生的姓名:");
                String name = sc.next();
                student_all.get(i).setName(name);
                System.out.println("请输入学生的年龄:");
                int age = sc.nextInt();
                student_all.get(i).setAge(age);
                System.out.println("请输入学生的家庭住址:");
                String address = sc.next();
                student_all.get(i).setAddress(address);
                return true;
            }
        }
        return false;

    }

    public static void studentQuery(ArrayList<StudentInfo> student_all){
        int num = student_all.size();
        if(num==0){
            System.out.println("当前无学生信息,请添加后再查询");
        }else{
            System.out.println("id"+"   "+"姓名"+"   "+"年龄"+"   "+"地址");
            for (int i = 0; i < student_all.size(); i++) {
                System.out.println(student_all.get(i).getId()+"   "+student_all.get(i).getName()+"   "+student_all.get(i).getAge()+"   "+student_all.get(i).getAddress());
            }
        }

    }


}
