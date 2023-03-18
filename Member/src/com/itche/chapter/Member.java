package com.itche.chapter;

public class Member implements Runnable{//线程类
    public Member(){
        System.out.println("【对象实例化时调用】电闪雷鸣，一代妖孽诞生了！");
    }
    @Override
    public void run() {//执行清除的时候执行此操作
        System.out.println("【对象回收】老天把妖孽收走了~");
    }
}
