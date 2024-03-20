package com.fengxiaoshuai.myfile;

import java.io.File;
import java.io.IOException;

public class FileDemo4 {
    public static void main(String[] args) throws IOException {
        // 创建一个新的文件(文件不存在返回true 文件存在返回false 父级目录不存在会有异常)
        File f1 = new File("D:\\op_matrix\\fhx.txt");
        f1.createNewFile();
        // 创建单级文件夹
        File f2 = new File("D:\\op_matrix\\fhx");
        boolean result1 = f2.mkdir();
        System.out.println(result1);
        // 创建多级文件夹(单级多级都可创建)
        File f3 = new File("D:\\op_matrix\\fhx\\xxxxx");
        f3.mkdirs();
        // 删除文件、空文件夹
        f1.delete();
        f3.delete();
        f2.delete();
    }
}
