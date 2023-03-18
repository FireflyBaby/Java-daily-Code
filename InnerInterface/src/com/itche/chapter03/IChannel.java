package com.itche.chapter03;

public interface IChannel {//定义接口
    public void send(IMessage msg);//发送消息
    interface IMessage{//内部接口
        public String getContent();//获取消息内容

    }

}
