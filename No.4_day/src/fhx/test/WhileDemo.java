package fhx.test;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        // 利用while打印1-100
        int i = 1;
        while(i <= 100){
            System.out.println(i);
            i++;
        }
        // for循环所控制的变量在退出循环就不能再被访问到了,while循环所控制的变量在退出循环还能被访问到。
        // 不知道循环的次数,有限使用while循环。
        System.out.println("---------------------");
        // 打印折纸的次数(珠穆朗玛峰)
        double j = 0.1;
        int count = 0;

        while(j<=8844430){
            j *= 2;
            count += 1;
        }
        System.out.println(count);
        System.out.println(j);
        System.out.println("---------------------");

        // 回文数(从左向右和从右向左读数一样)
        System.out.println("请输入一个整数:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int z = x;
        int y = x;
        int num_count = 0;
        // 求出输入整数位数
        while(x % 10 != 0 ){
            x = x / 10;
            num_count += 1;
        }//122221
        loopouter:
        if (num_count == 1){
            System.out.println(y+"是个位数,所以它是回文数！！！");
        }else{
            for(i=1;i <= (num_count/2);i++){
                if((z / ((int)Math.pow(10,(i-1))) % 10) != (z / (int)Math.pow(10,(num_count-i)) % 10)){
                    System.out.println(y+"这个数不是回文数！！！");
                    break loopouter;
              }

            }
            System.out.println(y+"这个数是回文数！！！");
        }
        System.out.println("---------------------");
    }
}
