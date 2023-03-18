package com.itche.chapter02;

import java.io.*;
import java.util.Properties;

public class Properties02 {
    public static void main(String[] args) throws IOException {
        File file=new File("d:"+File.separator+"苏沄沐"+File.separator+"zhurui01.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"gbk"));
        String str=null;
        int i=1;
        while ((str=br.readLine())!=null){
            System.out.println(i+++"."+str);
        }
        br.close();

    }
}
