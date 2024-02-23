package com.fengxiaoshuai.treemapdemo;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo1 {
    public static void main(String[] args) {
        TreeMap<Student,String> treeMap = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getAge()!=o2.getAge()){
                    return o1.getAge()-o2.getAge();
                }else{
                    if(o1.getName().equals(o2.getName())){
                        return 0;
                    }else{
                        return o1.getName().compareTo(o2.getName());
                    }
                }
            }
        });

        treeMap.put(new Student("丰小帅",18),"北京");
        treeMap.put(new Student("丰中帅",20),"上海");
        treeMap.put(new Student("丰大帅",21),"广州");
        System.out.println(treeMap);
        treeMap.put(new Student("丰小帅",18),"帝都");
        System.out.println(treeMap);
    }
}
