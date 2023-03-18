package com.test.chapter;

import java.io.*;

public class JavaDemo {
    public static void main(String[] args) throws IOException {
        OutputStream output=new FileOutputStream("d:"+ File.separator+"mldn.txt");
        output.write("中华人民共和国万岁！".getBytes("ISO8859-1"));
        output.close();
    }
}
