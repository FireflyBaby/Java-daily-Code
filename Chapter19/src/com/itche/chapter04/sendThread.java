package com.itche.chapter04;

import java.io.IOException;
import java.io.PipedOutputStream;

public class sendThread implements Runnable{
    private PipedOutputStream output;//管道输出流
    public sendThread(){
        this.output=new PipedOutputStream();//实例化管道输出流
    }
    @Override
    public void run() {
        for (int x=0;x<10;x++) {
            try {
                this.output.write(("【第" +(x+1)+ Thread.currentThread().getName() + "次信息发送】www.mldn.cn\n").getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            this.output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public PipedOutputStream getOutput() {
        return output;
    }
}
