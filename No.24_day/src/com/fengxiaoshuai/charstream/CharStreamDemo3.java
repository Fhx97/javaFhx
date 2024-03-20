package com.fengxiaoshuai.charstream;

import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo3 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("../No.24_day/output/f4.txt",true);
        // fw.write(25105);
        fw.write("丰小帅啊啊啊！");
        fw.close();
    }
}
