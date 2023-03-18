package com.itche.chapter03;

import java.io.IOException;
import java.io.PipedOutputStream;

public class SendThread implements Runnable{
    private PipedOutputStream output;//管道的输出流
    public SendThread(){
        this.output=new PipedOutputStream();//实例化管道输出流
    }
    @Override
    public void run() {
        for (int x=0;x<10;x++) {
            try {//利用管道实现数据的发送处理
                this.output.write(("【第"+(x+1)+"次信息发送"+Thread.currentThread().getName() + "】www.mldn.cn\n").getBytes());
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
