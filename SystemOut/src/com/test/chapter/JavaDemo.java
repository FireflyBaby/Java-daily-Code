package com.test.chapter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class JavaDemo {
    public static void main(String[] args) throws FileNotFoundException {
        System.setErr(new PrintStream(new FileOutputStream(new File("d:"+File.separator+"mldn-err.txt"))));
        try{
            Integer.parseInt("a");
        } catch (Exception e){
            System.out.println(e);
            System.err.println(e);//输出到文件里了
        }
    }
}
