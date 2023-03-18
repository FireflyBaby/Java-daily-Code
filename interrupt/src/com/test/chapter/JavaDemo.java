package com.test.chapter;

public class JavaDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(()->{
            System.out.println("***72小时的疯狂我需要睡觉补充精力。");
            try {
                Thread.sleep(10000);//预计准备休眠10秒
            } catch (InterruptedException e) {
                System.out.println("敢打扰我睡觉，老子宰了你。");
            }
            System.out.println("***睡足了可以继续祸害别人了。");
        });
        thread.start();//开始睡
        Thread.sleep(1000);
        if (!thread.isInterrupted()){//线程中断了吗？
            System.out.println("我偷偷的打扰一下你的睡眠。");
            thread.interrupt();//中断执行
        }
    }
}
