package fhx.ariopr;

import java.util.Scanner;

public class TernaryOpr {
    public static void main(String[] args) {
        // 三元运算符,运算结果必须被使用
        // 输出三个值中的的最大值
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数:");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数:");
        int b = sc.nextInt();
        System.out.println("请输入第三个整数:");
        int c = sc.nextInt();
        int d = a > b ? a : b;
        int e = a > c ? a : c;
        int f = d > e ? d : e;
        // ctrl + alt + L自动格式化代码
        System.out.println("大的那个数为:" + f);

    }
}
