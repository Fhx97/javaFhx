package com.fengxiaoshuai;

import java.util.Random;
import java.util.Scanner;

public class Lotteries {
    public static void main(String[] args) {
        // 请输入您的六组红色球号码和一组蓝色球号码
        // 将7个输入号码装进数组
        System.out.println("六个红色球不能重复,输入重复号码则作废！！！");
        // 用于标记是否输入重复的数字
        boolean flag = true;
        int[] input_num = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < input_num.length-1; i++) {
            System.out.println("请输入第"+(i+1)+"个红色球号码(1-33之间):");
            int num = sc.nextInt();
            while (num<1 || num>33){
                System.out.println("请再次输入第"+(i+1)+"个红色球号码(1-33之间):");
                num = sc.nextInt();
            }
            input_num[i] = num;
        }
        System.out.println("请再输入一个蓝色球号码(1-16之间):");
        int num_1 = sc.nextInt();
        while (num_1<1 || num_1>16){
            System.out.println("请再输入一个蓝色球号码(1-16之间):");
            num_1 = sc.nextInt();
        }
        input_num[6] = num_1;
        System.out.print("您输入的号码为:");
        for (int k : input_num) {
            System.out.print(k + " ");
        }
        System.out.print("\n");
        for (int i = 0; i < input_num.length-1; i++) {
            for (int j = 0; j < input_num.length-1; j++) {
                if(i!=j){
                    if(input_num[i]==input_num[j]){
                        flag = false;
                    }
                }
            }

        }

        if(flag){
            // 红色球1-33装入数组
            int[] red_num = new int[33];
            for (int i = 0; i < red_num.length; i++) {
                red_num[i] = i+1;
                // System.out.print(red_num[i]+" ");
            }
            // System.out.print("\n");
            // 蓝色球1-16装入数组中
            int[] blue_num = new int[16];
            for (int i = 0; i < blue_num.length; i++) {
                blue_num[i]=i+1;
                // System.out.print(blue_num[i]+" ");
            }
            // 随机6个红色球以及一个蓝色球放入开奖数组
            int[] lottery_num = new int[7];
            Random r = new Random();
            for (int i = 0; i < lottery_num.length-1; i++) {
                int r_index =r.nextInt(33);
                lottery_num[i] = red_num[r_index];
            }
            int b_index = r.nextInt(16);
            lottery_num[6] = blue_num[b_index];
            System.out.print("本期开奖号码为:");
            // 开奖红色区号码可能存在重复,所以对此进行去重。
            for (int i = 0; i < lottery_num.length-1; i++) {
                for (int j = 0; j < lottery_num.length-1; j++) {
                    if(i!=j){
                        while (lottery_num[i]==lottery_num[j]){
                            lottery_num[i] = r.nextInt(33);
                        }
                    }
                }

            }
            for (int k : lottery_num) {
                System.out.print(k + " ");
            }
            System.out.print("\n");
            // 红球中奖个数
            int count = 0;
            for (int i = 0; i < input_num.length-1; i++) {
                for (int j = 0; j < lottery_num.length-1; j++) {
                    if(input_num[i]==lottery_num[j]){
                        count += 1;
                    }

                }
            }
            if(input_num[6]==lottery_num[6] && count == 6){
                System.out.println("恭喜您获得一等奖:一千万元！！！");
            }else if (count == 6){
                System.out.println("恭喜您获得二等奖:五百万元！！！");
            }else if(count == 5){
                System.out.println("恭喜您获得三等奖:3000元！！！");
            }else if(input_num[6]==lottery_num[6] && (count==0||count==1||count==2)){
                System.out.println("恭喜您获得六等奖:5元！！！");
            }else if((count==3 && input_num[6]==lottery_num[6])||(count==4 && input_num[6]!=lottery_num[6])){
                System.out.println("恭喜您获得五等奖:10元！！！");
            }else{
                System.out.println("不好意思,您没有中奖！！！");
            }

        }else{
            System.out.println("您输入的红色球号码存在重复,所以此次投注无效！！！");
        }




    }
}
