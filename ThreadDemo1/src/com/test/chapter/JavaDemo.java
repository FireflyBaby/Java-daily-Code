package com.test.chapter;

public class JavaDemo {
    public static void main(String[] args) {
        System.out.println("1.执行操作任务一。");
        new Thread(()->{//子线程负责统计
            int temp=0;
            for (int x=0;x<Integer.MAX_VALUE;x++){
                temp+=x;
            }
        }).start();
        System.out.println("2.执行操作任二。");
        System.out.println("n.执行操作任务n。");
    }
}
