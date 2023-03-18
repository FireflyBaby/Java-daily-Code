package com.itche.chapter03;

public abstract class Message {
    private String type;
    public abstract String getConnectInfo();
    public static Message getInstance(){
        return new DataBaseMessage("客户消息");
    }
    public Message(String type){//类中没有提供无参构造
        this.type=type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
}
