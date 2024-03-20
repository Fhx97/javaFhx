package com.fengxiaoshuai.myfile;

import java.io.File;

public class FileDemo7 {
    public static void main(String[] args) {
        // 统计一个文件夹的总大小
        File src = new File("C:\\");
        System.out.println(totalMemory(src));


    }
    public static long totalMemory(File src){
        File[] files = src.listFiles();
        long total = 0;
        if(files != null){
            for (File file : files) {
                if(file.isFile()){
                    total += file.length();
                }else{
                    total = total + totalMemory(file);
                }
            }
        }
        return total;
    }
}
