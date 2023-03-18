package com.test.chapter;

import java.io.*;

public class JavaDemo {
    public static void main(String[] args) throws IOException {
        File file=new File("d:"+File.separator+"hello"+File.separator+"mldn.txt");
        InputStream input=new FileInputStream(file);
        byte[] data=input.readAllBytes();
        System.out.println("【"+new String(data)+"】");
        input.close();
    }
}
