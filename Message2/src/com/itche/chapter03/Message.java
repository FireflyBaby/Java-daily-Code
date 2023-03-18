package com.itche.chapter03;

public class Message {
    private String title;
    private String content;
    private boolean flag=true;//表示生产或消费形式
    //flag=true 允许生产，但是不允许消费
    //flag=false 允许消费，但是不允许生产
    public synchronized void set(String title,String content){
        if (!this.flag){//无法进行生产，应该等待被消费
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.title=title;
        this.content=content;
        this.flag=false;//已经生产过了
        super.notify();//唤醒等待的线程
    }
    public synchronized String get(){
        if (this.flag){//还未生产，需要等待
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try{//不管如何都要执行
            return this.title+"-"+this.content;
        }finally {
            this.flag=true;//继续生产
            super.notify();//等待唤醒线程
        }
    }
}
