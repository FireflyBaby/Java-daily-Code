package com.itche.chapter03;

public interface IChannel {
    public void send();//发送消息
    abstract class AbstractMessage{
        public abstract String getcontent();
    }
}
