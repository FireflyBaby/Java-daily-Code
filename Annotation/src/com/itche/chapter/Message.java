package com.itche.chapter;

public class Message {
    @DefaultAnnotation(title = "MLDN",url = "www.mldnjava.cn")
    public void send(String msg){
        System.out.println("【发送消息】"+msg);
    }
}
