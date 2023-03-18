package com.itche.chapter03;

public interface IChannel {//定义接口
    public void send();//发送消息
    class ChannelImpl implements IChannel{

        @Override
        public void send() {
            System.out.println("www.mldn.cn");
        }
    }
    public static IChannel getInstance(){
        return new ChannelImpl();
    }
}
