package com.mldn.chapter02;

public class Singleton {
    private static volatile Singleton instance=null;
    private Singleton(){
        System.out.println("【"+Thread.currentThread().getName()+"】"+"*******实例化Singleton类对象*************");
    }
    public static  Singleton getInstance(){
        if (instance==null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    public void print(){
        System.out.println("www.mldn.cn");
    }
}
