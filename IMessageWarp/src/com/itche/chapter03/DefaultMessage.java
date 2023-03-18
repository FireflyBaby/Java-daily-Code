package com.itche.chapter03;

public class DefaultMessage implements IMessageWarp.IMessage{
    @Override
    public String getContent() {
        return "www.mldn.cn";
    }
}
