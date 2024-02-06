package com.fengxiaoshuai;

import java.util.Random;

public class GiveScore {
    public static void main(String[] args) {
        Random r = new Random();
        int[] score_array = new int[6];
        int sum = 0;
        // 将六个评委的成绩封装进数组
        for(int i = 0;i<6;i++){
            score_array[i] = r.nextInt(101);
        }
        // 打印六个评委的成绩
        for (int i = 0; i < score_array.length; i++) {
            System.out.print(score_array[i]+" ");

        }
        System.out.print("\n");
        // 求六个评委的总成绩
        for (int i = 0; i < score_array.length; i++) {
            sum += score_array[i];
        }
        // 求六个评委的最高分和最低分
        int score_max = score_array[0];
        int score_min = score_array[0];
        for (int i = 0; i < score_array.length; i++) {
            score_max = score_max > score_array[i] ? score_max : score_array[i];
            score_min = score_min < score_array[i] ? score_min : score_array[i];
        }
        double score_avg = (sum-score_min-score_max) / 4.0;
        System.out.println("六个评委中最高分为:"+score_max);
        System.out.println("六个评委中最低分为:"+score_min);
        System.out.println("去除最高分和最低分后的平均成绩为:"+score_avg);

    }
}
