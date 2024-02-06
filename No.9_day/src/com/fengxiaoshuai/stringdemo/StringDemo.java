package com.fengxiaoshuai.stringdemo;

public class StringDemo {
    public static void main(String[] args) {
        // 直接赋值,存储在StringTable(串池)
        // 当使用双引号直接赋值时,系统会检查该字符串是否在串池中存在(存在就复用,不存在就创建新的)
        String s_1 = "丰小帅";
        System.out.println(s_1);
        // 空参构造:可以获取一个空白的字符串对象
        String s_2 = new String();
        System.out.println(s_2);
        // 传递一个字符数组,根据字符数组的内容再创建一个新的字符串对象
        // 利用转换改变字符串的内容
        char[] chs = {'f','h','x'};
        String s_3 = new String(chs);
        System.out.println(s_3);
        // 传递一个字节数组,根据字节数组的内容再创建一个新的字符串对象
        // 转换成ASCII码对应的字符,一般用于信息转换
        byte[] bytes = {97,98,99,100};
        String s_4 = new String(bytes);
        System.out.println(s_4);

        // '==':对于基本数据类型,比较的是具体的值;对于引用数据类型,比较的是地址值。
        String s_5 = "abc";
        String s_6 = "abc";
        System.out.println(s_5==s_6);
        String s_7 = "aaa";
        String s_8 = "bbb";
        System.out.println(s_7==s_8);
        String s_9 = "abc";
        String s_10 = new String("abc");
        System.out.println(s_9==s_10);
        String s_11 = "AbC";

        // 字符串比较:equals()方法(完全一样true);equalsIngoreCase()(忽略大小写的比较)。
        System.out.println(s_9.equals(s_10));
        System.out.println(s_10.equalsIgnoreCase(s_11));

    }
}
