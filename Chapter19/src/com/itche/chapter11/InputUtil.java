package com.itche.chapter11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputUtil{
    public static final BufferedReader INPUT=new BufferedReader(new InputStreamReader(System.in));
    private InputUtil(){}
    public static String getString(String prompt){
        String str=null;
        boolean flag=true;
        while (flag){
            System.out.print(prompt);
            try {
                str=INPUT.readLine();
                if (!"".equals(str)){
                    flag=false;
                }else {
                    System.out.println("输入的内容不允许为空");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return str;
    }
}
