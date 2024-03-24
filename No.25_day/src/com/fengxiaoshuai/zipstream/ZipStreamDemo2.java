package com.fengxiaoshuai.zipstream;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamDemo2 {
    public static void main(String[] args) throws IOException {
        File src = new File("../No.25_day/output/copyF1.txt");
        File des = new File("../No.25_day/output");
        toZip(src,des);

    }
    public static void toZip(File src,File des) throws IOException {
        // 创建压缩流关联压缩包
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(des,"test1.zip")));
        // 创建ZipEntry对象,表示压缩包里面的每一个文件和文件夹
        ZipEntry entry = new ZipEntry("copyF1.txt");
        // 把ZipEntry对象放到压缩包当中
        zos.putNextEntry(entry);
        // 将数据写入
        FileInputStream fis = new FileInputStream(src);
        int ch;
        while ((ch = fis.read())!=-1){
            zos.write(ch);
        }
        zos.closeEntry();
        zos.close();

    }
}
