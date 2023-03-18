package com.itche.chapter;

import java.lang.reflect.Method;

public class JavaDemo {
    public static void main(String[] args) {
        IMessage msg=(IMessage) new MLDNProxy().bind(new MessageReal());
        msg.send();
    }
}

