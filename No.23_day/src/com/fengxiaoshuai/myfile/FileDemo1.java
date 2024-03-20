package com.fengxiaoshuai.myfile;

import java.io.File;

public class FileDemo1 {
    // File对象就表示一个路径,可以是文件的路径,也可以是文件夹的路径
    // 这个路径可以是存在的,也可以是不存在的
    public static void main(String[] args) {
        String str = "C:\\Users\\丰小帅\\Desktop\\Java\\No.23_day";
        File f1 = new File(str);
        System.out.println(f1);

        String str1 = "C:\\Users\\丰小帅\\Desktop\\Java\\No.23_day";
        String str2 = "a.txt";
        File f2 = new File(str1,str2);
        System.out.println(f2);

        File f3 = new File("C:\\Users\\丰小帅\\Desktop\\Java\\No.23_day");
        String str3 = "a.txt";
        File f4 = new File(f3,str3);
        System.out.println(f4);
    }
}
