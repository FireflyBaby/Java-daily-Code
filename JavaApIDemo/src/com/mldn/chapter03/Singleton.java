package com.mldn.chapter03;

public class Singleton {
    final static Singleton INSTANCE=new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){
        return INSTANCE;
    }
    public void print(){
        System.out.println("沄沐，我喜欢你！");
    }
}
