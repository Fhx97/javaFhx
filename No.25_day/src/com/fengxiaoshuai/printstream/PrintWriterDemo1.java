package com.fengxiaoshuai.printstream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo1 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("../No.25_day/output/x3.txt"),true);
        pw.println("你今天终于想起来了！");
        pw.print("怎么办啊！");
        pw.close();

    }
}
