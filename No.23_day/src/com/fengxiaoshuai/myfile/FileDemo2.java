package com.fengxiaoshuai.myfile;

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        // 对一个文件的路径进行判断
        File f1 = new File("D:\\op_matrix\\bj07_total.csv");
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());
        System.out.println(f1.exists());
        // 对一个文件夹的路径进行判断
        File f2 = new File("D:\\op_matrix");
        System.out.println(f2.isDirectory());
        System.out.println(f2.isFile());
        System.out.println(f2.exists());

        // 对一个不存在的路径进行判断
        File f3 = new File("D:\\op");
        System.out.println(f3.isDirectory());
        System.out.println(f3.isFile());
        System.out.println(f3.exists());
    }
}
