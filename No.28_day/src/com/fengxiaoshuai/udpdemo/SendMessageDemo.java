package com.fengxiaoshuai.udpdemo;

import java.io.IOException;
import java.net.*;

public class SendMessageDemo {
    public static void main(String[] args) throws IOException {
        /*
        * 创建对象
        * 绑定端口:通过端口往外发送
        * 空参:所有可用的端口中随机一个往外发送
        * 有参:指定端口进行绑定
         */
        DatagramSocket ds = new DatagramSocket();

        /*
        * 打包数据
        *
        * */
        String str = "丰小帅，你好啊！";
        byte[] bytes = str.getBytes();
        InetAddress host = InetAddress.getByName("127.0.0.1");
        int port = 10086;
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,host,port);

        /*
        * 发送数据
        * */
        ds.send(dp);

        /*
        * 释放资源
        * */
        ds.close();


    }
}
