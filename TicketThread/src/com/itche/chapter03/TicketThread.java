package com.itche.chapter03;

public class TicketThread implements Runnable{
    private volatile int ticket=3;
    @Override
    public void run() {

            this.sale();

    }
    private synchronized void sale(){
        if (this.ticket>0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("【"+Thread.currentThread().getName()+"】卖票ticket="+this.ticket--);
        }
    }
}
