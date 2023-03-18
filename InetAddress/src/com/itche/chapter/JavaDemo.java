package com.itche.chapter;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class JavaDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
        InetAddress host = InetAddress.getByName("DESKTOP-7NLJTC3");
        System.out.println("host="+host);
        InetAddress host1 = InetAddress.getByName("www.baidu.com");
        System.out.println("host1="+host1);
        String hostAddress = host1.getHostAddress();
        System.out.println("host1对应的ip="+hostAddress);
        System.out.println("host1对应的主机名/或域名="+host1.getHostName());
    }
}
