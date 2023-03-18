package com.itche.chapter01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Server {
    public static void main(String[] args) throws Exception{
        DatagramSocket socket = new DatagramSocket(9998);
        byte[] data = "明天吃火锅吗？Hello~".getBytes();
        DatagramPacket packet = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.233.1"), 9999);
        socket.send(packet);
        byte[] msg=new byte[1024];
        DatagramPacket packet1 = new DatagramPacket(msg, msg.length);
        System.out.println("服务器端等待接收数据......");
        socket.receive(packet1);//调用接收方法，将通过网络传输的DatagramPacket对象填充到packet对象
        System.out.println(new String(packet1.getData(),0,packet1.getLength()));
        socket.close();

    }
}
