package com.fengxiaoshuai.udpdemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class ReceiveMessageDemo {
    public static void main(String[] args) throws IOException {
        /*
        * 创建对象
        * 接收的时候一定要绑定端口
        * 绑定的端口应与发送的保持一致
        * */
        DatagramSocket ds = new DatagramSocket(10086);

        /*
        * 接收数据
        * */
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        // 该方法是阻塞的(等待发送端发送消息)
        ds.receive(dp);

        /*解析数据包*/
        byte[] data = dp.getData();
        int len = dp.getLength();
        InetAddress address= dp.getAddress();
        int port = dp.getPort();

        System.out.println("接收到的数据" + new String(bytes,0,len));
        System.out.println("该数据从" + address + "这台电脑的" + port + "这个端口发出的！");

        /*
        * 释放资源
        * */
        ds.close();

    }
}
