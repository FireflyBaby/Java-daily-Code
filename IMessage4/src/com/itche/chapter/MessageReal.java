package com.itche.chapter;

public class MessageReal implements IMessage{
    @Override
    public void send() {
        System.out.println("【发送消息】www.mldn.cn");
    }
}
