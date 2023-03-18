package com.test.chapter;

import com.itche.chapter03.Channel;
import com.itche.chapter03.Message;

public class JavaDemo {
    public static void main(String[] args) {
        new Thread(()->{
            Message msg=new Message();
            msg.setInfo("第一个线程的消息");
            Channel.setMessage(msg);
            Channel.send();
        },"消息发送者A").start();
        new Thread(()->{
            Message msg=new Message();
            msg.setInfo("第二个线程的消息");
            Channel.setMessage(msg);
            Channel.send();
        },"消息发送者B").start();
        new Thread(()->{
            Message msg=new Message();
            msg.setInfo("第三个线程的消息");
            Channel.setMessage(msg);
            Channel.send();
        },"消息发送者C").start();
    }
}
