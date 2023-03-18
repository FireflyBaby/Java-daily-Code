package com.itche.chapter02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Properties01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src\\com\\itche\\chapter02\\mysql.properties"));
        String str=null;
        while ((str=br.readLine())!=null){
            String[] data=str.split("=");
            System.out.println(data[0]+"值是："+data[1]);
        }
        br.close();
    }
}
