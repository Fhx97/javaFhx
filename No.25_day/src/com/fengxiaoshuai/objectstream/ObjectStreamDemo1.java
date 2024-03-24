package com.fengxiaoshuai.objectstream;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo1 {
    // 利用序列化流(对象操作输出流),把一个对象写到本地文件中
    // 使用对象输出流将对象保存到文件时会出现NotSerializableException异常
    // 需要让Javabean类实现Serializable接口
    public static void main(String[] args) throws IOException {
        // 创建对象
        Student stu = new Student("丰小帅",27,"北京");
        // 创建序列化流的对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("../No.25_day/output/h2.txt"));
        // 写入数据
        oos.writeObject(stu);
        // 释放资源
        oos.close();


    }
}
