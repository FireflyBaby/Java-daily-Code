package com.test.chapter;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class JavaDemo {
    public static void main(String[] args) throws IOException {
        String str="www.mldn.cn";//小写字母
        InputStream input=new ByteArrayInputStream(str.getBytes());//将数据保存到内存流
        //必须调用子类来调用子类自己的扩展方法
        ByteArrayOutputStream output=new ByteArrayOutputStream();//读取内存中的数据
        int data=0;
        while ((data=input.read())!=-1){//每一次读取一个字节
            output.write(Character.toUpperCase(data));//保存数据
        }
        byte[] result= output.toByteArray();//获取全部数据
        System.out.println(new String(result));//自己处理字节数据
        input.close();
    }
}
