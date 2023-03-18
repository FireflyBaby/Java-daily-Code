package com.test.chapter;

public class JavaDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(()->{
            for (int x=0;x<100;x++){
                if (x%3==0){
                    Thread.yield();
                    System.out.println("###玩耍的线程礼让###");
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"、执行x="+x);
            }
        },"玩耍的线程");
        thread.start();
        for (int i=0;i<100;i++){
            Thread.sleep(100);
            System.out.println("【霸道的线程】number="+i);
        }
    }
}
