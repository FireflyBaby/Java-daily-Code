package com.itche.chapter03;

public class Messageimpl implements IMessage<String>{

    @Override
    public String echo(String s) {
        return "【ECHO】"+s;
    }
}
