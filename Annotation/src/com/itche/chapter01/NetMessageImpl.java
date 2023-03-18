package com.itche.chapter01;

public class NetMessageImpl implements IMessage{
    @Override
    public void send(String msg) {
        System.out.println("【网络消息发送】"+msg);
    }
}
