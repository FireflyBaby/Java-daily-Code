package com.itche.chapter01;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
    public static void main(String[] args) throws Exception{
        DatagramSocket datagramSocket = new DatagramSocket(9999);
        byte[] data=new byte[1024];
        DatagramPacket packet = new DatagramPacket(data, data.length);
        System.out.println("接收端等待接收数据......");
        datagramSocket.receive(packet);//调用接收方法，将通过网络传输的DatagramPacket对象填充到packet对象
        System.out.println(new String(packet.getData(),0,packet.getLength()));
        byte[] msg = "好的，明天见~".getBytes();
        DatagramPacket packet1 = new DatagramPacket(msg, msg.length, InetAddress.getByName("192.168.233.1"), 9998);
        datagramSocket.send(packet1);
        datagramSocket.close();
    }
}
