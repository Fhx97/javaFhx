package com.fengxiaoshuai.tcpdemo;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        // TCP协议:发送数据
        // 创建对象
        Socket socket = new Socket("127.0.0.1",10000);
        // 获取输出流
        OutputStream os = socket.getOutputStream();
        os.write("丰小帅".getBytes());
        // 释放资源
        os.close();
        socket.close();

    }
}
