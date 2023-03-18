package com.itche.chapter03;

public class Consumer implements Runnable{
    private Message message;
    public Consumer(Message message){
        this.message=message;
    }
    @Override
    public void run() {
        for (int x=0;x<100;x++){
            System.out.println(this.message.get());
        }
    }
}
