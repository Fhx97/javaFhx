package com.fengxiaoshuai.bufferedexercise;

import java.io.*;

public class BufferDemo2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("../No.25_day/output/count.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("../No.25_day/output/count.txt"));
        String line = br.readLine();
        int count = Integer.parseInt(line);
        count++;
        if(count <= 3){

            System.out.println("欢迎使用本软件，第"+count + "次免费使用！");
        }else{
            System.out.println("本软件只能免费使用3次，欢迎您注册会员后继续使用");
        }
//        bw.close();
        br.close();

    }
}
