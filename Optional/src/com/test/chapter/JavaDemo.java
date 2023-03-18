package com.test.chapter;

import com.itche.chapter03.IMessage;
import com.itche.chapter03.MessageImpl;
import com.itche.chapter03.MessageUtil;

import java.util.Optional;

public class JavaDemo {
    public static void main(String[] args) {
        IMessage temp=MessageUtil.getMessage().orElse(new MessageImpl());
        MessageUtil.useMessage(temp);
    }
}
