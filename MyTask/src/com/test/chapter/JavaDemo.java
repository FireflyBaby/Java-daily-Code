package com.test.chapter;

import com.itche.chapter03.MyTask;

import java.util.Timer;

public class JavaDemo {
    public static void main(String[] args) {
        Timer timer=new Timer();
        //定义间隔任务，100毫秒后开始执行，每秒执行一次
        timer.scheduleAtFixedRate(new MyTask(),100,1000);

    }
}
