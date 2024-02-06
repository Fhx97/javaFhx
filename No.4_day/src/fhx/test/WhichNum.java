package fhx.test;

import java.util.Random;
import java.util.Scanner;

public class WhichNum {
    public static void main(String[] args) {
        // 获取随机数
        Random r = new Random();
        // 取值范围从0开始,左闭右开。
        // int num = r.nextInt(100);
        // 1-100之间的随机数
        int num = r.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字:");

        boolean flag = false;
        while(flag == false){
            int x = sc.nextInt();
            if (x == num){
                System.out.println("恭喜,您猜对了！");
                flag = true;
            }else if (x > num){
                System.out.println("猜大了！");
            }else{
                System.out.println("猜小了");
            }

        }

    }
}
