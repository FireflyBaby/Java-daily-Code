package com.test.chapter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class JavaDemo {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("d:"+File.separator+"mldn.txt");
        PrintWriter pu=new PrintWriter(new FileOutputStream(file));
        String name="小强子子";
        int age=78;
        double salary=77392.4242424;
        pu.printf("姓名：%s,年龄：%d,收入：%9.2f",name,age,salary);
        pu.close();
    }
}
