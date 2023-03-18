package com.itche.chapter03;

public interface IMessage {
    public String message();
    public default boolean connect(){
        System.out.println("建立消息的发送通道。");
        return true;
    }
    public static IMessage getInstance(){
       return new MessageImpl();
    }

}
