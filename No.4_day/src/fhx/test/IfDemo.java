package fhx.test;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        // if单分支结构
//        // 如果对一个布尔类型的变量进行判断,不要用'==',建议把变量写在小括号即可。
//        System.out.println("请输入女婿的酒量:");
//        double w = sc.nextDouble();
//        if (w > 2) {
//            System.out.println("这个女婿可以的！");

//        // if 双分支结构
//        System.out.println("您的余额还有多些？");
//        int money = sc.nextInt();
//        if (money > 100){
//            System.out.println("今天小搓一顿！！！");
//        }else{
//            System.out.println("好好吃泡面吧！！！");
//        }

        // if 多分支结构
        System.out.println("请输入您的成绩:");
        int score = sc.nextInt();
        if (score >= 0 && score <= 100){
            if (score >= 95 && score <= 100){
                System.out.println("奖励公路车一辆！");
            }else if (score >= 90 && score <= 94){
                System.out.println("游乐场一日游！！！");
            }else if (score >= 80 && score <= 89){
                System.out.println("大黄蜂玩具车一个！！！");
            }else{
                System.out.println("再接再厉啊！！！");
            }
        }else{
            System.out.println("请输入一个0-100的数值！！！");
        }


    }
}
