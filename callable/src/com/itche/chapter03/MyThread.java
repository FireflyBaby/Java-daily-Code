package com.itche.chapter03;

import java.util.concurrent.Callable;

public class MyThread implements Callable<String> {
    @Override
    public String call() throws Exception {
        for (int i=0;i<10;i++){
            System.out.println("*****线程执行、i="+i);
        }
        return "线程执行完毕！";

    }
}
