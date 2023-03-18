package com.itche.chapter03;

public class DeadLock implements Runnable {
    private Jian jian=new Jian();
    private Qiang qiang=new Qiang();
    @Override
    public void run() {
        jian.say(qiang);
    }
    public DeadLock(){
        new Thread(this).start();
        qiang.say(jian);
    }
}
class Jian{
    public synchronized void say(Qiang qiang){
        System.out.println("阿健说：此路是我开，要想从此过，留下10块钱。");
        qiang.get();
    }
    public synchronized void get(){
        System.out.println("阿健说：得到10块钱后，可以买饭吃。于是让出了路。");
    }
}
class Qiang{
    public synchronized void say(Jian jian){
        System.out.println("小强说：让我先跑，我再给你钱。");
        jian.get();
    }
    public synchronized void get(){
        System.out.println("小强说：逃过了一劫，可以继续送快餐了。");
    }
}
