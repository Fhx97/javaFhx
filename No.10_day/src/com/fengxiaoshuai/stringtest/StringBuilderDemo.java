package com.fengxiaoshuai.stringtest;

public class StringBuilderDemo {
    // StringBuilder可以看成是一个容器,创建之后的内容是可变的。
    // 提高字符串的操作效率。
    public static void main(String[] args) {
        // 创建对象
        StringBuilder str = new StringBuilder("丰小帅");
        System.out.println(str);
        // 添加元素
//        str.append(1);
//        str.append(1.2);
//        str.append(true);
//        System.out.println(str);
        // 反转
        str.reverse();
        System.out.println(str);
        // 获取长度
        int len = str.length();
        System.out.println(len);


    }
}
