package com.fengxiaoshuai.udpdemo;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class FromChatRoom {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        Scanner sc = new Scanner(System.in);
        while (true){
            String str = sc.next();
            if(str.equals("886")){
                break;
            }
            byte[] bytes = str.getBytes();
            InetAddress host = InetAddress.getByName("127.0.0.1");
            int port = 10088;
            DatagramPacket dp = new DatagramPacket(bytes,bytes.length,host,port);
            ds.send(dp);
        }
        ds.close();

    }
}
