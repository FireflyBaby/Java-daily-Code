package com.itche.chapter03;

import java.io.IOException;
import java.io.OutputStream;

public class PrintUtil implements AutoCloseable{//实现常用数据的输出
    private OutputStream output;//不管现在你如何进行输出操作，核心使用的就是OutputStream

    public PrintUtil(OutputStream output) {//由外部来决定输出的位置
        this.output = output;
    }

    public void print(String str){//输出字符串
        try {
            this.output.write(str.getBytes());//输出
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
