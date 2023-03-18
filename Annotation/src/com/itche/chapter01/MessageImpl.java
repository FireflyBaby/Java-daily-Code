package com.itche.chapter01;

public class MessageImpl implements IMessage{
    @Override
    public void send(String msg) {
        System.out.println("【消息发送】"+msg);
    }
}
