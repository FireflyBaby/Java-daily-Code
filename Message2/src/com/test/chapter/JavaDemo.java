package com.test.chapter;

import com.itche.chapter03.Consumer;
import com.itche.chapter03.Message;
import com.itche.chapter03.Producer;

public class JavaDemo {
    public static void main(String[] args) {
        Message message=new Message();
        new Thread(new Producer(message)).start();//启动生产者线程
        new Thread(new Consumer(message)).start();//启动消费线程
    }
}
