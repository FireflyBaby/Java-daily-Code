package com.test.chapter;

import com.itche.chapter03.IMessage;

public class JavaDemo {
    public static void main(String[] args) {
        IMessage.getInstance().send("www.mldn.cn");
    }
}
