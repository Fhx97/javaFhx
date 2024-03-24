package com.fengxiaoshuai.objectstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectStreamDemo3 {
    /*
    * 将多个自定义对象序列化到文件中
    * 但由于对象的个数不确定
    * 反序列化该如何读取呢
    * */
    public static void main(String[] args) throws IOException {
        Student1 s1 = new Student1("丰小帅",18,"北京");
        Student1 s2 = new Student1("丰中帅",22,"上海");
        Student1 s3 = new Student1("丰大帅",28,"杭州");
        ArrayList<Student1> list= new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("../No.25_day/output/x1.txt"));
        oos.writeObject(list);
//        oos.writeObject(s2);
//        oos.writeObject(s3);
        oos.close();

    }
}
