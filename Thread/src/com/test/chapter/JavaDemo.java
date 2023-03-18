package com.test.chapter;

import com.itche.chapter03.MyThread;

public class JavaDemo {
    public static void main(String[] args) {
        MyThread md=new MyThread();
        new Thread(md,"线程A").start();//设置了线程的名字
        md.run(); //对象直接调用run()方法
    }
}
