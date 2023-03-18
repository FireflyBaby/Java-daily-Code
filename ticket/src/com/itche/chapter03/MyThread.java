package com.itche.chapter03;

public class MyThread implements Runnable{//线程的主体类
    private int ticket=5;

    @Override
    public void run() {
        for (int i=0;i<100;i++){
            if (ticket>0){
            System.out.println("卖票，ticket="+this.ticket--);
            }
        }
    }
}
