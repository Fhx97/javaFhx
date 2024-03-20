package com.fengxiaoshuai.myfile;

import java.io.File;

public class FileDemo6 {
    public static void main(String[] args) {
        // 找到电脑中所有以avi结尾的电影
        File src = new File("C:\\");
        findAVI(src);

    }

    public static void findAVI(File src){
        // 进入文件夹
        File[] files = src.listFiles();
        if(files != null){
            // 遍历数组
            for (File file : files) {
                if(file.isFile()){
                    // 判断:如果是文件,就可以执行题目的业务逻辑
                    String name = file.getName();
                    if (name.endsWith(".avi")){
                        System.out.println(file);
                    }
                }else{
                    //如果是文件夹,就可以递归
                    findAVI(file);
                }
        }


        }
    }
}
