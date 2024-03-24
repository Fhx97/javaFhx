package com.fengxiaoshuai.zipstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo3 {
    public static void main(String[] args) throws IOException {
        // 要压缩的文件路径
        File src = new File("../No.25_day/output");
        // 压缩包的存放路径
        File desParent = src.getParentFile();
        File des = new File(desParent,src.getName()+".zip");
        // 创建压缩流关联压缩包
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(des));
        // 获取src里面的每一个文件,变成ZipEntry对象,放入到压缩包当中
        toZip(src,zos,src.getName());

        //释放资源
        zos.close();

    }
    public static void toZip(File src,ZipOutputStream zos,String name) throws IOException {
        File[] files = src.listFiles();
        for (File file : files) {
            if(file.isFile()){
                // 文件:直接变为ZipEntry对象,放入到压缩包当中
                ZipEntry entry = new ZipEntry(name + "/" + file.getName());
                zos.putNextEntry(entry);
                FileInputStream fis = new FileInputStream(file);
                int b;
                while ((b = fis.read()) != -1){
                    zos.write(b);
                }
                fis.close();
                zos.closeEntry();
            }else{
                // 文件夹:递归
                toZip(file,zos,name + "/" + file.getName());
            }
        }
    }
}
