package com.fengxiaoshuai.InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("丰小帅");
        System.out.println(address);
        String name = address.getHostName();
        System.out.println(name);
        String host = address.getHostAddress();
        System.out.println(host);
    }
}
