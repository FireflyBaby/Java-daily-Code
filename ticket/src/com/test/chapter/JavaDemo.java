package com.test.chapter;

import com.itche.chapter03.MyThread;

public class JavaDemo {
    public static void main(String[] args) {
        MyThread md=new MyThread();
        new Thread(md).start();//第一个线程启动
        new Thread(md).start();//第二个线程启动
        new Thread(md).start();//第三个线程启动
    }
}
