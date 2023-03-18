package com.itche.chapter03;

public interface IMessageWarp {//消息包装
    static interface IMessage{
        public String getContent();
    }
    static interface IChannel{
        public boolean connect();//消息的发送通道
    }
    public static void send(IMessage msg,IChannel channel){
        if (channel.connect()){
            System.out.println(msg.getContent());
        }else {
            System.out.println("消息通道无法建立，消息发送失败！");
        }
    }
}
