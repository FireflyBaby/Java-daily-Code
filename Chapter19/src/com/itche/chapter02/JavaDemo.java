package com.itche.chapter02;

import java.io.*;
import java.util.Properties;
import java.util.Scanner;

public class JavaDemo  {
    public static void main(String[] args)throws IOException {
//        File file=new File("src\\com\\itche\\chapter02\\mysql.properties");
        Properties properties = new Properties();
        properties.load(new FileReader("src\\com\\itche\\chapter02\\mysql.properties"));
        properties.list(System.out);
        System.out.println("用户名："+properties.getProperty("user"));
        System.out.println("密码："+properties.getProperty("pwd"));



    }
}
