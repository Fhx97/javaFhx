package fhx.ariopr;

import java.util.Scanner;

public class NumSplit {
    public static void main(String[] args) {
        // 创建对象
        Scanner sc = new Scanner(System.in);
        // 接收数据
        System.out.println("请输入一个三位数:");
        int i = sc.nextInt();
        int i_b = i / 100;
        System.out.println("百位为:" + i_b);
        int i_s = (i-i_b*100) / 10;
        System.out.println("十位为:" + i_s);
        int i_g = i-i_b*100 - i_s*10;
        System.out.println("个位为:" + i_g);
    }
}
