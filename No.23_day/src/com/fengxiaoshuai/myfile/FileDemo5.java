package com.fengxiaoshuai.myfile;

import java.io.File;

public class FileDemo5 {
    public static void main(String[] args) {
        File f1 = new File("D:\\op_matrix");
        // 获取文件夹里的所有内容
        // 当调用者File表示的路径不存在时,返回null
        // 当调用者File的路径是文件时,返回null
        // 当调用者File的路径是一个空文件夹时,返回一个长度为0的数组
        // 当调用者File表示的路径是一个有内容的文件夹时,将里面所有文件和文件夹的路径放在File数组中返回
        // 当调用者File表示的路径是一个有隐藏文件的文件夹时,将里面所有文件和文件夹的路径放在File数组中返回,包含隐藏文件
        // 当调用者File表示的路径是需要权限才能访问的文件夹时,返回null
        for (File file : f1.listFiles()) {
            System.out.println(file);
        }

    }
}
