package com.itche.chapter03;

public class Channel {//消息发送通道
    private static final ThreadLocal<Message>THREADLOCAL=new ThreadLocal<Message>();

    public static void setMessage(Message message) {
        THREADLOCAL.set(message);//向ThreadLocal中保存数据
    }

    public static void send(){//发送消息
        System.out.println("【"+Thread.currentThread().getName()+"、消息发送】"+THREADLOCAL.get().getInfo());
    }
}
