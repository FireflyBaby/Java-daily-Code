package com.itche.chapter03;

public class Resource {
    private Computer computer;
    public synchronized void make()throws Exception{
        if (this.computer!=null){//已经生产过
            super.wait();
        }
        Thread.sleep(100);
        this.computer=new Computer("ThinkBook牌电脑",1.1);
        System.out.println(Thread.currentThread().getName()+this.computer);
        super.notifyAll();
    }
    public synchronized void get() throws Exception {
        if (this.computer==null){//没生产过
            super.wait();
        }
        Thread.sleep(10);
        System.out.println(Thread.currentThread().getName()+this.computer);
        this.computer=null;//已经取走
        super.notifyAll();
    }
}
