package com.itche.chapter03;

public class Producer implements Runnable{
    private Message message;

    public Producer(Message msg) {
        this.message=msg;
    }

    @Override
    public void run() {
        for (int x=0;x<100;x++){
            if (x%2==0){
                this.message.set("王建","宇宙大帅哥");

           }else {
                this.message.set("小高", "猥琐第一人，常态保持");
            }
        }
    }
}
