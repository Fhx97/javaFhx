package com.fengxiaoshuai;

import java.util.Scanner;

public class MathDemo2 {
    public static void main(String[] args) {
        // 1634
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        String number = sc.next();
        boolean flag = selfPower(number);
        if(flag){
            System.out.println(number+"是自幂数");
        }else{
            System.out.println(number+"不是自幂数");
        }

    }
    public static boolean selfPower(String number){
        int count = number.length();
        char[] numStr = number.toCharArray();
        int[] numInt = new int[count];
        for (int i = 0; i < numInt.length; i++) {
            numInt[i] = numStr[i] - 48;
        }
        int numFinal = 0;
        for (int i = 0; i < numInt.length; i++) {
            numFinal = (int) (numFinal + Math.pow(10,count-i-1)*numInt[i]);
        }
        int numCom = 0;
        for (int i = 0; i < numInt.length; i++) {
            numCom = (int) (numCom + Math.pow(numInt[i],count));
        }
        if(numFinal == numCom){
            return true;
        }else{
            return false;
        }


    }

}


