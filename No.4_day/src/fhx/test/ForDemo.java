package fhx.test;

import java.util.Scanner;

public class ForDemo {
    public static void main(String[] args) {
        // for循环语句:初始化语句+判断语句+条件控制语句。
        for(int i = 1;i<=10;i++){
            System.out.println(i);
        }

        System.out.println("--------------------");
        for(int i = 5;i>=1;i--){
            System.out.println(i);
        }
        System.out.println("--------------------");

        // 求1-5之间的累加和
        int sum = 0;
        for (int i = 1;i <= 5;i++){
            sum += i;
        }
        System.out.println(sum);


        System.out.println("--------------------");
        // 求1-100之间的偶数和
        int sum_hundred = 0;
        for (int i = 1;i <= 100;i++){
            if (i % 2 == 0){
                sum_hundred += i;
            }
        }
        System.out.println(sum_hundred);


        System.out.println("--------------------");
        // 统计满足条件的数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字:");
        int num_1 = sc.nextInt();
        System.out.println("请输入第二个数字:");
        int num_2 = sc.nextInt();
        int count_num = 0;
        for(int i = num_1;i<=num_2;i++){
            if(i%3==0 && i%5==0){
                count_num += 1;
            }
        }
        System.out.println(count_num);


    }
}
