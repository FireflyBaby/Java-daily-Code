package com.itche.chapter03;

public class MyThread implements Runnable{
    private volatile int ticket=3;//直接内存操作
    @Override
    public void run() {
        synchronized (this) {
            while (this.ticket > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "卖票处理，ticket=" + this.ticket--);
            }

        }
    }
}
