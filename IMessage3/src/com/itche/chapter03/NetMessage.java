package com.itche.chapter03;

public class NetMessage implements IMessage{
    private String msg;
    public NetMessage(String msg){
        this.msg=msg;
    }
    public boolean open(){//获取资源连接
        System.out.println("【OPEN】获取消息发送连接资源。");
        return true;
    }
    public void close()throws Exception{
        System.out.println("【CLOSE】关闭消息发送通道。");
    }
    @Override
    public void send() {
        if (this.open()){
            System.out.println("【***发送消息****】");
        }
    }
}
