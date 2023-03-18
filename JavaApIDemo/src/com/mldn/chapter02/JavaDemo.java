package com.mldn.chapter02;

public class JavaDemo {
    public static void main(String[] args) {
        for (int x=0;x<3;x++){
            new Thread(()->Singleton.getInstance().print(),"单例消费端-"+x).start();
        }
    }
}
