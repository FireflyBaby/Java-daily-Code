package com.itche.chapter04;

import java.io.*;

public class JavaDemo {
    public static void main(String[] args) throws IOException {
        sendThread send=new sendThread();
        receiveThread receive = new receiveThread();
        send.getOutput().connect(receive.getInput());//进行管道连接
        new Thread(send,"消息发送线程").start();
        new Thread(receive,"消息接收线程").start();
    }
}
