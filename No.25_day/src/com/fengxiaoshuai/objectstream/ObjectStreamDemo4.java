package com.fengxiaoshuai.objectstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ObjectStreamDemo4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("../No.25_day/output/x1.txt"));
        // 读取多个对象
        ArrayList<Student1> list = (ArrayList<Student1>) ois.readObject();
        for (Student1 student : list) {
            System.out.println(student);
        }
        ois.close();
    }
}
