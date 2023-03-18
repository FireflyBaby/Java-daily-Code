package com.test.chapter;

public class JavaDemo {
    public static boolean flag=true;
    public static void main(String[] args) {
        new Thread(()->{
            long num=0;
            while (flag){
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"正在运行、num="+num++);
            }
        },"执行线程").start();
        try {
            Thread.sleep(200);//运行200ms
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        flag=false;//停止线程
    }
}
