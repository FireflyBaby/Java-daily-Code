package com.itche.chapter03;

public class MessageImpl implements IMessage{
    @Override
    public String message() {
        if (this.connect()){
            return "www.mldn.cn";
        }
        return "没有消息发送";
    }
}
