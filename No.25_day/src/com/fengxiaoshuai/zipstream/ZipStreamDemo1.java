package com.fengxiaoshuai.zipstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipStreamDemo1 {
    public static void main(String[] args) throws IOException {
        // 解压
        File src = new File("../No.25_day/output/test.zip");
        File des = new File("../No.25_day/output");
        unzip(src,des);



    }
    // 定义一个方法用来解压
    public static void unzip(File src, File des) throws IOException {
        // 解压的本质:把压缩包里面的每一个文件或者文件夹读取出来,按照层级拷贝到目的地当中
        //创建一个解压缩流用来读取压缩包中的数据
        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));
        // 获取压缩包里面的每一个zipentry对象
        ZipEntry entry;
        while ((entry = zip.getNextEntry())!=null){
            if(entry.isDirectory()){
                File file = new File(des,entry.toString());
                file.mkdirs();
            }else{
                File file = new File(des,entry.toString());
                FileOutputStream fos = new FileOutputStream(file);
                int b;
                while ((b = zip.read())!=-1){
                    fos.write(b);
                }
                fos.close();
                // 表示在压缩包中一个文件处理完毕了
                zip.closeEntry();
            }
        }
        zip.close();
    }
}
