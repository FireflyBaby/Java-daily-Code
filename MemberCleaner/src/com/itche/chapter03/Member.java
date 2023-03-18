package com.itche.chapter03;

public class Member implements Runnable{//线程类
    public Member(){
        System.out.println("【对象实例化时调用】电闪雷鸣，一代妖孽诞生了！");
    }

    @Override
    protected void finalize() throws Throwable {//析构函数
        System.out.println("【member被回收了】老天爷要把妖孽收走了！");
        throw new Exception("老子还想再活500年");
    }

    @Override
    public void run() {
        System.out.println("【对象回收】老天把妖孽收走了");
    }
}
