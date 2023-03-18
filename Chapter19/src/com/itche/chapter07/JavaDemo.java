package com.itche.chapter07;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("请输入您的年龄：");
        String msg=br.readLine();
        if (msg.matches("\\d{1,3}")){
            int age=Integer.parseInt(msg);
            System.out.println("年龄为："+age);
        }else {
            System.out.println("请确保您看懂我的提示，不要随意输入，伤不起！");
        }
        br.close();

    }
}
