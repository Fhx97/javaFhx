package com.fengxiaoshuai.studentcall;

import cn.hutool.core.io.file.FileReader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class StudentCallDemo2 {
    public static void main(String[] args) {
        FileReader fr = new FileReader("../../../output/names.txt");
        String result = fr.readString();
        String[] arr = result.split("\r\n");
        ArrayList<String> boys = new ArrayList<>();
        ArrayList<String> girls = new ArrayList<>();
        for (String s : arr) {
            if(s.substring(4,5).equals("男")){
                boys.add(s);
            }else{
                girls.add(s);
            }
        }
        callStudent(boys,girls,1000000);
    }
    public static void callStudent(ArrayList<String> boys,ArrayList<String> girls,int count){
        Random r = new Random();
        int i = 0;
        int boyCount = 0;
        int girlCount = 0;
        while (i<count){
            i++;
            double randomNum = r.nextDouble();
            if(randomNum < 0.7){
                Collections.shuffle(boys);
                System.out.println(boys.get(0));
                boyCount++;
            }else{
                Collections.shuffle(girls);
                System.out.println(girls.get(0));
                girlCount++;
            }
        }
        System.out.println("男生被抽取："+boyCount+"次");
        System.out.println("女生被抽取："+girlCount+"次");
    }
}
