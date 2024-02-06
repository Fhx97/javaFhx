package com.fengxiaoshuai;

import java.util.Scanner;

public class BuyAirTicket {
    public static void main(String[] args) {
        System.out.println("请输入够买月份:");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        if (month > 12 || month < 1) {
            System.out.println("请输入正确的月份！！！");
        } else {
            System.out.println("请选择购买舱位:输入1代表经济舱,2代表头等舱。");
            int type = sc.nextInt();
            if (month >= 5 && month <= 10) {
                switch (type) {
                    case 1 -> System.out.println("旺季经济舱8.5折！");
                    case 2 -> System.out.println("旺季头等舱9折！");
                    default -> System.out.println("请输入1或者2！");
                }

            }else{
                switch (type) {
                    case 1 -> System.out.println("淡季经济舱6.5折！");
                    case 2 -> System.out.println("淡季头等舱7折！");
                    default -> System.out.println("请输入1或者2！");
                }

            }
        }
    }
}
