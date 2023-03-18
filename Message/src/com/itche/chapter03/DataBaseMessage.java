package com.itche.chapter03;

public class DataBaseMessage extends Message{
    public DataBaseMessage(String type) {
        super(type);
    }

    @Override
    public String getConnectInfo() {//方法覆写
        return "Oracle数据库连接信息。";
    }
}
