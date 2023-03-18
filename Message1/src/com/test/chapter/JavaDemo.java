package com.test.chapter;

import com.itche.chapter03.Message;

public class JavaDemo {
    public static void main(String[] args) {

        Message<String>msgA=new Message<String>();
        msgA.setContent("www.mldn.cn");

        fun(msgA);

    }
    public static void fun(Message<? extends String> temp){//泛型的上限
        System.out.println(temp.getContent());
    }
}
