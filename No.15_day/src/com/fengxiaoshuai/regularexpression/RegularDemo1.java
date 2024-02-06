package com.fengxiaoshuai.regularexpression;

public class RegularDemo1 {
    public static void main(String[] args) {
        String str = "我要学编编编编编编编编编编编编程程程程程程程程";
        String regex = "((.)\\2+)";
        String str1 = str.replaceAll(regex,"$2");
        System.out.println(str1);
    }
}
