package com.test.chapter;

import com.itche.chapter03.DataBaseMessage;
import com.itche.chapter03.Message;
import com.itche.chapter03.WebServerMessage;

public class JavaDemo {
    public static void main(String[] args) {
        Message msg=new DataBaseMessage();//向上转型
        fun(new DataBaseMessage());//Message msg=new DataBaseMessage();
        fun(new WebServerMessage());//Message msg=mew WebServerMessage();

    }
    public static void fun(Message msg){
        msg.print();
    }
}
