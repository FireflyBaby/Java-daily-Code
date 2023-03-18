package com.itche.chapter03;

public class WebServerMessage extends Message{
    @Override
    public void print() {
        System.out.println("WEB服务器连接信息...");
    }
}
