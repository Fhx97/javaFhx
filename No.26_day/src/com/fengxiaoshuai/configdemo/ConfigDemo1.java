package com.fengxiaoshuai.configdemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDemo1 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.put("aaa","bbb");
        prop.put("aaa","bbb");
        System.out.println(prop);
        FileOutputStream fos = new FileOutputStream("output/fhx.properties");
        prop.store(fos,"Fighting");
    }
}
