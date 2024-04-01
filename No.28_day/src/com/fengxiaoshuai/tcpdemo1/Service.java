package com.fengxiaoshuai.tcpdemo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Service {
    public static void main(String[] args) throws IOException {
        ServerSocket sc = new ServerSocket(10086);
        Socket socket = sc.accept();
        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        int b ;
        while ((b = br.read())!= -1){
        System.out.println((char)b);}


    }
}
