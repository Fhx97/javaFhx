package com.fengxiaoshuai.charstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("../No.24_day/output/f3.txt");
        char[] chars = new char[2];
        int len;
        // 有参read方法把读取数据、解码和强转三步合并了
        while ((len = fr.read(chars)) != -1){
            System.out.print(new String(chars,0,len));
        }
        fr.close();
    }
}
