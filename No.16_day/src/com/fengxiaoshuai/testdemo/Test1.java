package com.fengxiaoshuai.testdemo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        int count = 0;
        while (count<=200){
            System.out.println("请输入数字:");
            String num = sc.nextLine();
            int i = Integer.parseInt(num);
            set.add(i);
            count += i;
        }
        for(Integer element : set){
            System.out.println(element);
        }
    }
}
