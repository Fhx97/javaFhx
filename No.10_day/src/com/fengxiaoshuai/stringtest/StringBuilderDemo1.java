package com.fengxiaoshuai.stringtest;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("fff");
        str.append("hhh");
        str.append("xxx");
        System.out.println(str);
        // 把StringBuilder对象变回字符串
        String out_str = str.toString();
        System.out.println(out_str);
    }
}
