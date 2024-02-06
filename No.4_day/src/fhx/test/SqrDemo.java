package fhx.test;

import java.util.Scanner;

public class SqrDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个不小于2的整数:");
        int x = sc.nextInt();
        int i = 1;
        while(i * i < x){
            i++;
        }
        System.out.println("整数部分为:"+(i-1));
    }
}
