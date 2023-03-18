package com.test.chapter;

import java.io.*;

public class JavaDemo {
    public static void main(String[] args) throws IOException {
        File file=new File("d:"+File.separator+"hello"+File.separator+"mldn.txt");
        if (file.exists()){//文件存在则进行读取
            Reader in=new FileReader(file);
            char[] data=new char[1024];
            int len=in.read(data);
            System.out.println("读取内容："+new String(data,0,len));
            in.close();
        }
    }
}
