package com.itche.chapter06;

import java.io.IOException;
import java.io.OutputStream;

public class PrintUtil implements AutoCloseable{//实现一些常用数据的输出
    private OutputStream output;
    public PrintUtil(OutputStream output){
        this.output=output;
    }
    public void print(String str){
        try {
            this.output.write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void print(long num){
        this.print(String.valueOf(num));
    }
    public void println(String str){
        this.print(str+"\r\n");
    }
    public void println(long num){
        this.println(String.valueOf(num));
    }

    @Override
    public void close() throws Exception {
        this.output.close();
    }
}
