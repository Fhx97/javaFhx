package com.fengxiaoshuai.mytest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDemo2 {
    // 文件加密:对原始文件中的每一个字节数据进行更改,然后将更改的数据存储到新的文件中
    // 文件解密:读取加密之后的文件,按照加密的规则反向操作,变成原始文件
    // 利用 "^"异或对同一个数字进行两次异或计算 返回原值
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("..//No.24_day/output/secret.jpg");
        FileOutputStream fos = new FileOutputStream("..//No.24_day/output/redu.jpg");
        int b;
        while ((b = fis.read()) != -1){
            fos.write(b^88);
        }

        fos.close();
        fis.close();

    }
}
