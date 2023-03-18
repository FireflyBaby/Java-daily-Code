package com.test.chapter;
import com.itche.chapter03.ReceiveThread;
import com.itche.chapter03.SendThread;

public class JavaDemo {
    public static void main(String[] args) throws Exception {
        SendThread send=new SendThread();
        ReceiveThread receive=new ReceiveThread();
        send.getOutput().connect(receive.getInput());//进行管道连接
        new Thread(send,"消息发送线程").start();
        new Thread(receive,"消息接收线程").start();
    }
}
