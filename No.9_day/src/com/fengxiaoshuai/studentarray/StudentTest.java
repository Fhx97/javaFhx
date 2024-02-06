package com.fengxiaoshuai.studentarray;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Student[] arr = new Student[3];

        Student student_1 = new Student("001","丰小帅",15);
        Student student_2 = new Student("002","丰大帅",16);
        Student student_3 = new Student("003","王小五",17);

        arr[0] = student_1;
        arr[1] = student_2;
        arr[2] = student_3;

        // 添加一个学生对象,如果学生信息存在,则直接退出
        Student student_4 = new Student("001","丰小帅",15);
        // 标识符判断,是否存在
        boolean stu_flag = true;
        for (int i = 0; i < 3; i++) {
            if(arr[i].getId()==student_4.getId()){
                stu_flag = false;
                break;
            }
        }
        if(stu_flag){
            arr[3] = student_4;
        }else{
            System.out.println("这个学生的信息已经存在！");
        }

        // 通过id删除学生信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除学生的学号:");
        String stu_del = sc.next();
        boolean del_flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getId().equals(stu_del)){
                del_flag = true;
                break;
            }
        }
        if(del_flag){
            System.out.println(stu_del+"信息已被成功删除！");
        }else{
            System.out.println(stu_del+"这名学生的信息不存在！");
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getId()=="001"){
                System.out.println(arr[i].toString());
            }
        }


    }
}
