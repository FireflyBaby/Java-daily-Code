package com.test.chapter;

import com.itche.chapter03.Consumer;
import com.itche.chapter03.Producer;
import com.itche.chapter03.Resource;

public class ThreadDemo {
    public static void main(String[] args) {
        Resource res=new Resource();
        new Thread(new Producer(res),"【生产电脑】").start();
        new Thread(new Consumer(res),"【取出电脑】").start();
    }
}
