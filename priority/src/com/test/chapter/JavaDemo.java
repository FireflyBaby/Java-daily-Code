package com.test.chapter;

public class JavaDemo {
    public static void main(String[] args) {
        Runnable run=()->{
            for (int i=0;i<10;i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"执行。");
            }
        };
        Thread threadA=new Thread(run,"线程对象A");
        Thread threadB=new Thread(run,"线程对象B");
        Thread threadC=new Thread(run,"线程对象C");
        threadA.setPriority(Thread.MIN_PRIORITY);
        threadB.setPriority(Thread.MIN_PRIORITY);
        threadC.setPriority(Thread.MAX_PRIORITY);
        threadA.start();
        threadB.start();
        threadC.start();
        System.out.println(Thread.currentThread().getPriority());
    }
}
