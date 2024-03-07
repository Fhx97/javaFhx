package com.fengxiaoshuai.studentcall;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class StudentCallDemo2 {
    public static void main(String[] args) {
        // 班里有N个学生,70%的概率随机到男生,30%的概率随机到女生
        // 创建集合
        ArrayList<Integer> list = new ArrayList<>();
        // 添加数据
        Collections.addAll(list,1,1,1,1,1,1,1);
        Collections.addAll(list,0,0,0);
        // 打乱集合中的数据
        Collections.shuffle(list);
        // 从list集合中随机抽取0或者1
        Random r = new Random();
        int index = r.nextInt(list.size());
        int number = list.get(index);
        System.out.println(number);

        // 创建男生名字集合
        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();
        Collections.addAll(boyList,"西灏","雨澄","弘辉","灏维","熙维","禹绍","奕煊");
        Collections.addAll(girlList,"寒云","怀薇","向秋");

        if(number==1){
            int boyIndex = r.nextInt(boyList.size());
            System.out.println(boyList.get(boyIndex));
        }else{
            int girlIndex = r.nextInt(girlList.size());
            System.out.println(girlList.get(girlIndex));
        }



    }
}
