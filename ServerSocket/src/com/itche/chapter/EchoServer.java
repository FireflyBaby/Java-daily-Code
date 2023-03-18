package com.itche.chapter;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.TreeMap;

public class EchoServer {
    private static class ClientThread implements Runnable{
        private Socket client=null;
        Scanner scan=null;
        PrintStream out=null;
        private boolean flag=true;
        public ClientThread(Socket client) throws Exception{
            this.client = client;
            this.scan = new Scanner(client.getInputStream());//客户端输入流
            this.scan.useDelimiter("\n");//设置分隔符
            this.out = new PrintStream(client.getOutputStream());//客户端输出流
        }
        @Override
        public void run() {
            while (this.flag){
                if (this.scan.hasNext()){//现在有数据发送
                    String val=scan.next().trim();//接收发送的数据
                    if ("byebye".equalsIgnoreCase(val)){
                        this.out.println("ByeByeBye...");
                        this.flag=false;//结束循环
                    }else {
                        this.out.println("【ECHO】"+val);
                    }
                }
            }
            try {
                this.scan.close();
                this.out.close();
                this.client.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(9999);//设置服务端的监听端口
        System.out.println("等待客户端连接......");
        boolean flag=true;
        while (flag) {
            Socket client = server.accept();
            new Thread(new ClientThread(client)).start();
        }
        server.close();
    }
}
