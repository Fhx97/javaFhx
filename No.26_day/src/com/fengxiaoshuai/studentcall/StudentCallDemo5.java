package com.fengxiaoshuai.studentcall;

import cn.hutool.core.io.file.FileReader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class StudentCallDemo5 {
    // 带权重的随机概率
    public static void main(String[] args) {
        FileReader fr = new FileReader("../../../output/names.txt");
        String result = fr.readString();
        String[] arr = result.split("\r\n");
        ArrayList<String> students = new ArrayList<>();
        for (int i = 0; i < 80; i++) {
            students.add(arr[i].substring(0,3));
        }
        getLottery(students,5);

    }
    public static void getLottery( ArrayList<String> students,int callCount){
        Random r = new Random();
        Collections.shuffle(students);
        String stu = students.get(0);
        students.remove(stu);
        int i = 0;
        while (callCount>0){
            double ranNum = r.nextDouble();
            double randomNumber = 1.0 /((double) students.size() * Math.pow(2,i));
            callCount--;
            i++;
            if(ranNum<randomNumber){
                System.out.println(stu);
            }else{
                Collections.shuffle(students);
                System.out.println(students.get(0));
            }
        }


    }
}
