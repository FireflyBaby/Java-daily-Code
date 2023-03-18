package com.test.chapter;

import java.io.IOException;
import java.io.InputStream;

public class JavaDemo {
    public static void main(String[] args) throws IOException {
        InputStream input=System.in;
        System.out.print("请输入信息:");
        byte[] data=new byte[1024];
        int len=input.read(data);
        System.out.println("输入内容为："+new String(data,0,len));
    }
}
