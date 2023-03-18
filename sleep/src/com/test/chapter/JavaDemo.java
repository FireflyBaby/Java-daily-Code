package com.test.chapter;

public class JavaDemo {
    public static void main(String[] args) {
        for (int i=0;i<5;i++){
          new Thread(()->{
              for (int x=0;x<10;x++){
                  System.out.println(Thread.currentThread().getName()+"、x="+x);
                  try {
                    Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    e.printStackTrace();
                 }
             }
          },"线程对象-"+i).start();
        }
    }
}
