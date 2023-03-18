package com.test.chapter;

import com.itche.chapter03.AddThread;
import com.itche.chapter03.Resource;
import com.itche.chapter03.SubThread;


public class JavaDemo {
    public static void main(String[] args) {
        Resource res=new Resource();
        AddThread ad=new AddThread(res);
        SubThread sd=new SubThread(res);
        new Thread(ad,"加法线程-A").start();
        new Thread(ad,"加法线程-B").start();
        new Thread(sd,"减法线程-X").start();
        new Thread(sd,"减法线程-Y").start();

    }
}
