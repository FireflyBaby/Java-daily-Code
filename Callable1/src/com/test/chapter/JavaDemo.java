package com.test.chapter;

import com.itche.chapter03.MyThread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class JavaDemo {
    public static void main(String[] args) throws Exception {
        MyThread mt=new MyThread();
        FutureTask<String>taskA=new FutureTask<String>(mt);
        FutureTask<String>taskB=new FutureTask<String>(mt);
        FutureTask<String>taskC=new FutureTask<String>(mt);
        new Thread(taskA,"竞赛者A").start();
        new Thread(taskB,"竞赛者B").start();
        new Thread(taskC,"竞赛者C").start();
        System.out.println(taskA.get());
        System.out.println(taskB.get());
        System.out.println(taskC.get());

    }
}
