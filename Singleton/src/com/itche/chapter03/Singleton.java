package com.itche.chapter03;

public class Singleton {
    private static Singleton instance;
//private static finnal Singleton INSTANCE=new Singleton();
    public static Singleton getInstance() {
        if (instance==null){//第一次使用
            instance=new Singleton();//实例化对象
        }
        return instance;
    }

    public void print(){
        System.out.println("www.mldn.cn");
    }
    private Singleton(){}
}
