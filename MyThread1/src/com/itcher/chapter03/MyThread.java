package com.itcher.chapter03;

public class MyThread implements Runnable{
    private int ticket=10;//总票数为10
    public synchronized boolean sale(){
        if (ticket>0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"卖票，ticket="+this.ticket--);
            return true;
        }else{
            System.out.println("***票已经卖光了*******");
            return false;
        }
    }
    @Override
    public void run() {
        while(this.sale()){

        }

    }
}
