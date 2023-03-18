package com.itche.chapter;
@FunctionalInterface
@Deprecated(since = "1.0")
public interface IMessage {//有两个Annotation
    public void send(String msg);
}
