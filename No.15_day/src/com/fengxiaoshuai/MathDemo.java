package com.fengxiaoshuai;

public class MathDemo {
    public static void main(String[] args) {
        // Math更多方法见API帮助文档
        System.out.println(Math.abs(-2));
        System.out.println(Math.ceil(7.2));
        System.out.println(Math.floor(7.2));
        System.out.println(Math.round(7.2));
        System.out.println(Math.max(5,2));
        System.out.println(Math.pow(2,3));
        // 随机范围为[0.0,1.0)
        System.out.println(Math.random());

        // 获取一个随机数
        // 1-100的随机数取值范围
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.floor(Math.random()*100)+1);
        }
    }
}
