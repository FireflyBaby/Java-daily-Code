package com.itche.chapter;

import java.io.Serializable;
@SuppressWarnings("serial")//无法在程序执行的时候获取
public class MessageImpl implements IMessage, Serializable {
    @Override
    public void send(String msg) {
        System.out.println("【消息发送】"+msg);
    }
}
