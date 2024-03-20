package com.fengxiaoshuai.myfile;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileDemo3 {
    public static void main(String[] args) {
        // 返回文件的大小(只能获取文件的大小,单位是字节),无法获取文件夹的大小
        File f1 = new File("D:\\op_matrix\\bj07_total.csv");
        System.out.println(f1.length());
        // 返回文件的绝对路径
        File f2 = new File("No.23_day\\src");
        System.out.println(f2.getAbsolutePath());
        // 返回定义文件时使用的路径
        System.out.println(f2.getPath());
        //获取名字
        System.out.println(f1.getName());
        System.out.println(f2.getName());
        // 返回文件的最后修改时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(f1.lastModified()));
        System.out.println(f2.lastModified());

    }
}
