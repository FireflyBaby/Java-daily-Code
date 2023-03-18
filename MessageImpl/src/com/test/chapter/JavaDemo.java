package com.test.chapter;

import com.itche.chapter03.IMessage;
import com.itche.chapter03.MessageImpl;

public class JavaDemo {
    public static void main(String[] args) {
        IMessage msg=IMessage.getInstance();
        System.out.println(msg.message());

    }
}
