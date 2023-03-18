package com.test.chapter;

public class ThreadDemo {
    public static void main(String[] args) {
        for (int i=0;i<3;i++){
            String title="线程对象"+i;
            new Thread(()->{
                for (int j=0;j<10;j++) {
                    System.out.println(title + ":j=" + j);
                }
            }).start();
        }
    }
}
