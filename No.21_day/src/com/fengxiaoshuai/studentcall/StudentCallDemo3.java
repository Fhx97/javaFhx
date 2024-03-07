package com.fengxiaoshuai.studentcall;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class StudentCallDemo3 {
    // 班级里有N个学生,被点到的学生不会再被点到
    // 但如果班级中所有的学生都点完了,需要重新开启第二轮点名
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> listTemp = new ArrayList<>();
        Collections.addAll(list,"西灏","雨澄","弘辉","灏维","熙维","禹绍","奕煊","寒云","怀薇","向秋");
        Random r = new Random();
        while (list.size()!=0){
        int index = r.nextInt(list.size());
        listTemp.add(list.get(index));
        System.out.print(list.get(index) + " ");
        list.remove(index);}
        int count = listTemp.size();
        System.out.println();
        for (int i = 0; i < count; i++) {
            int index = r.nextInt(listTemp.size());
            String name = listTemp.remove(index);
            System.out.print(name + " ");
        }
    }
}
