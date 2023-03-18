package com.test.chapter;

import com.itche.chapter03.MyThread;

public class JavaDemo {
    public static void main(String[] args) {
        Runnable mt=new MyThread();
        new Thread(mt,"票贩子A").start();
        new Thread(mt,"票贩子B").start();
        new Thread(mt,"票贩子C").start();
    }
}
