package com.test.chapter;

import java.io.*;

public class JavaDemo {
    public static void main(String[] args) throws IOException {
        File file=new File("d:"+File.separator+"hello"+File.separator+"mldn.txt");
        InputStream input=new FileInputStream(file);
        byte[] data=new byte[1024];//开辟一个缓冲区读取数据
        int len=input.read(data);//读取数据，数据全部保存在字节数组之中
        System.out.println("【"+new String(data,0,len)+"】");
        input.close();
    }
}
