package com.test.chapter;

import com.itche.chapter03.DataBaseMessage;
import com.itche.chapter03.Message;

public class JavaDeno {
    public static void main(String[] args) {
       Message msg=Message.getInstance();
        System.out.println(msg.getConnectInfo());
        System.out.println(msg.getType());
    }
}
