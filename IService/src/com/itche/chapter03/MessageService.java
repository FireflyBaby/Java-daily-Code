package com.itche.chapter03;

public class MessageService implements IService{
    @Override
    public boolean connect() {
        return true;
    }

    @Override
    public String getInfo() {
        return null;
    }

    @Override
    public String service() {
        return "获取消息服务。";
    }
}
