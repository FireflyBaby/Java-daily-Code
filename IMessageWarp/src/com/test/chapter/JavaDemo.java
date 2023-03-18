package com.test.chapter;

import com.itche.chapter03.DefaultMessage;
import com.itche.chapter03.IMessageWarp;
import com.itche.chapter03.NetChannel;

public class JavaDemo {
    public static void main(String[] args) {
        IMessageWarp.send(new DefaultMessage(),new NetChannel());
    }
}
