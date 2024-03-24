package com.fengxiaoshuai.objectstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectStreamDemo2 {
    // 反序列化流(操作对象输入流)可以把序列化到本地文件夹中的对象,读取到程序中来
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("../No.25_day/output/h2.txt"));
        System.out.println(ois.readObject());
        ois.close();
    }
}
