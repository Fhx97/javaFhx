package com.fengxiaoshuai;

public class ObjectDemo_2 {
    // 封装:对象代表了什么,就得封装对应的数据,并提供数据对应的行为。

    public static void main(String[] args) {
        String f = "fengxiaoshuai";
        int len = f.length();
        System.out.println(len);

        String F = f.toUpperCase();
        System.out.println(F);
        System.out.println(f.hashCode());
        System.out.println(F.hashCode());
    }


}
