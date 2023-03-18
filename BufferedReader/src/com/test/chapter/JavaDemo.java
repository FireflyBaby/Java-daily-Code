package com.test.chapter;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("请输入您的年龄：");
        String msg=input.readLine();//接收输入信息
        if (msg.matches("\\d{1,3}")){
            int age=Integer.parseInt(msg);
            System.out.println("年龄为："+age);
        }else {
            System.out.println("输入的内容不是数字，程序而无法正常执行！");
        }
    }
}
