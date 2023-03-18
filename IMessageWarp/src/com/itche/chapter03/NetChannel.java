package com.itche.chapter03;

public class NetChannel implements IMessageWarp.IChannel{
    @Override
    public boolean connect() {
        return true;
    }
}
