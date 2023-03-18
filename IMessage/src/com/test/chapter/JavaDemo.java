package com.test.chapter;

import com.itche.chapter03.IMessage;
import com.itche.chapter03.Messageimpl;

public class JavaDemo {
    public static void main(String[] args) {
        IMessage<String> msg=new Messageimpl();
        System.out.println(msg.echo("www.mldn.cn"));
    }
}
