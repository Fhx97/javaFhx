package com.fengxiaoshuai.studentcall;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.file.FileReader;

import java.util.ArrayList;
import java.util.Collections;

public class StudentCallDemo1 {
    public static void main(String[] args) {
        FileReader fr = new FileReader("../../../output/names.txt");
        String result = fr.readString();
        String[] arr = result.split("\r\n");
        ArrayList<String> students = new ArrayList<>();
        for (String s : arr) {
            students.add(s.substring(0,3));
        }
        callStudent(students,12);


    }
    public static void callStudent(ArrayList<String> students,int number){
        int i = 0;
        while (i < number){
            i++;
            Collections.shuffle(students);
            String stu = students.get(0);
            System.out.println("第"+i+"次运行程序：随机同学"+stu);
            // 被点过的学生去除,不会再被call
            students.remove(stu);
        }
    }
}
