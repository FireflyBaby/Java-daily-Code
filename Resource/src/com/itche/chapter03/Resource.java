package com.itche.chapter03;

public class Resource {//定义一个操作资源
    private int num=0;//这个是要进行加减操作的数据
    private  boolean flag=true;//加减切换
    //flag=true,表示可以进行加法操作，但是无法进行减法操作
    //flag=false,表示可以进行减法操作，但是无法进行加法操作
    public synchronized void add() throws Exception {//执行加法操作
        if (this.flag == false) {//现在需要执行的是减法操作，加法操作要等待
            super.wait();
        }
        this.num++;
        Thread.sleep(100);
        System.out.println("【加法操作-" + Thread.currentThread().getName() + "】num=" + this.num);
        this.flag = false;//加法操作执行完毕，需要执行减法处理
        super.notifyAll();//唤醒全部等待线程
    }
    public synchronized void sub() throws Exception{//执行减法操作
        if (this.flag==true){//减法操作需要等待
            super.wait();
        }
        this.num--;
        Thread.sleep(200);
        System.out.println("【减法操作-"+Thread.currentThread().getName()+"】num="+this.num);
        this.flag=true;
        super.notifyAll();
    }

}
