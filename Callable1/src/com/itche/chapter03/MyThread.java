package com.itche.chapter03;

import java.util.concurrent.Callable;

public class MyThread implements Callable<String> {
    private boolean flag=true;//抢答处理
    @Override
    public String call() throws Exception {
        synchronized (this){
            if (this.flag==true){//抢答成功
                this.flag=false;
                return Thread.currentThread().getName()+"抢答成功";
            }else{
                return Thread.currentThread().getName()+"抢答失败";
            }
        }
    }
}
