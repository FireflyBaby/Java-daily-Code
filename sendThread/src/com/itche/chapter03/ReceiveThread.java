package com.itche.chapter03;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PipedInputStream;

public class ReceiveThread implements Runnable{
    private PipedInputStream input;
    public ReceiveThread(){
        this.input=new PipedInputStream();
    }
    @Override
    public void run() {
        byte[] data=new byte[1024];
        int len=0;
        ByteArrayOutputStream bos=new ByteArrayOutputStream();//所有的数据保存到内存输出流
        try {
            while ((len = this.input.read(data)) != -1) {
                bos.write(data,0,len);
            }
            System.out.println("{" + Thread.currentThread().getName() + "接收消息\n}" + new String(bos.toByteArray()));
        } catch(IOException e){
                e.printStackTrace();
        }
        try {
            this.input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public PipedInputStream getInput() {
        return input;
    }
}
