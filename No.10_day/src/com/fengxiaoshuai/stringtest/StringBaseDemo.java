package com.fengxiaoshuai.stringtest;

public class StringBaseDemo {
    // 字符串拼接的底层原理
    // 拼接的时候没有变量,都是字符串,触发字符串的优化机制,编译的时候即最终结果。(类似字符串直接赋值)
    // 拼接的时候有变量,在JDK8以前,使用StringBuilder进行拼接
    // JDK8版本之后,系统会预估字符串拼接之后的总大小,把要拼接的内容放在数组中,一个新的字符串
    // StringBuilder提高效率原理图:所有要拼接的内容都往StringBuilder中放,不会创建很多无用的内存,节约内存

    // StringBuilder源码分析
    // 默认创建一个长度为16的字节数组
    // 添加的内容长度小于16,直接存
    // 添加的内容大于16会扩容(原来的容量*2+2)
    // 如果扩容之后还不够,以实际的长度为准

    public static void main(String[] args) {
        StringBuilder str_bul = new StringBuilder();
//        System.out.print(str_bul.capacity()+" ");
//        System.out.print(str_bul.length()+" ");
//        System.out.println();
//
//        str_bul.append("abc");
//        System.out.print(str_bul.capacity()+" ");
//        System.out.print(str_bul.length()+" ");
//        System.out.println();
//
//        str_bul.append("defghijklmnopqrstuvwxyz");
//        System.out.print(str_bul.capacity()+" ");
//        System.out.print(str_bul.length()+" ");
//        System.out.println();

        str_bul.append("abcdefghijklmnopqrstuvwxyzfhxfhxfhxfhx");
        System.out.print(str_bul.capacity()+" ");
        System.out.print(str_bul.length()+" ");
        System.out.println();
    }

}
