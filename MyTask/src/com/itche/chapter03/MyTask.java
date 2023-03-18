package com.itche.chapter03;

import java.util.TimerTask;

public class MyTask extends TimerTask {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"、定时任务执行，当前时间："+System.currentTimeMillis());
    }
}
