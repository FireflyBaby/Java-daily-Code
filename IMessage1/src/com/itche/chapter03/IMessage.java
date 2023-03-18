package com.itche.chapter03;

public interface IMessage {
    public void send(String str);
    public static IMessage getInstance(){
        return new IMessage() {
            @Override
            public void send(String str) {
                System.out.println(str);
            }
        };
    }
}
