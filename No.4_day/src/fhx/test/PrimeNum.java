package fhx.test;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        // 质数是指在大于1的自然数中，除了1和它本身以外不再有其他因数的自然数。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数:");
        int x = sc.nextInt();
        int i = 2;
        while(x%i != 0 && i < x){
            i++;
        }
        if(x==i){
            System.out.println(x+"这个数是质数！");
        }else{
            System.out.println(x+"这个数不是质数！");
        }





    }
}
