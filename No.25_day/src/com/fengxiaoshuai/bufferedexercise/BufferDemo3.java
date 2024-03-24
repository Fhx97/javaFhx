package com.fengxiaoshuai.bufferedexercise;

import java.io.*;

public class BufferDemo3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("../No.25_day/output/count.txt"));
//        String line = br.readLine();
//        int count = Integer.parseInt(line);
        int count = Integer.parseInt(br.readLine());
        count++;
        if(count <= 3){

            System.out.println("欢迎使用本软件，第"+count + "次免费使用！");
        }else{
            System.out.println("本软件只能免费使用3次，欢迎您注册会员后继续使用");
        }
        br.close();
        // 注意写入要和读取分开写,否则会清空文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("../No.25_day/output/count.txt"));
        bw.write(count+"");
        bw.close();
    }
}
