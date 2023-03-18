package com.test.chapter;

import com.itche.chapter03.PrintUtil;

import java.io.File;
import java.io.FileOutputStream;

public class JavaDemo {
    public static void main(String[] args) throws Exception {
        File file=new File("d:"+File.separator+"mldn.txt");
        PrintUtil pu=new PrintUtil(new FileOutputStream(file));
        pu.println("姓名：小强子");
        pu.print("年龄：");
        pu.println(78);
        pu.close();
    }
}
