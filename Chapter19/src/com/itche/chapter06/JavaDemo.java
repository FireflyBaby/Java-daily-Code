package com.itche.chapter06;

import java.io.*;

public class JavaDemo {
    public static void main(String[] args) throws Exception {
        InputStream input = System.in;
        System.out.print("请输入信息：");
        byte[] data=new byte[6];
        int len=0;
        ByteArrayOutputStream bos=null;
        while ((len=input.read(data))!=-1) {
            bos= new ByteArrayOutputStream(len);
            bos.write(data,0,len);
            System.out.print(new String(bos.toByteArray()));
        }
        input.close();
        bos.close();

    }
}
