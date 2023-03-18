package com.itche.chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class FileUtil {
    public static String load(File file){
        Scanner scanner=null;
        try {
            scanner=new Scanner(file);
            if (scanner.hasNext()) {
                String str = scanner.next();//获取数据
                return str;
            }
            return null;
        } catch (Exception e) {
            return null;
        }finally {
            if (scanner!=null){
                scanner.close();
            }
        }
    }
    public static boolean append(File file,String content){
        PrintStream out=null;
        try {
            out = new PrintStream(new FileOutputStream(file, true));
            out.print(content);
            return true;
        } catch (Exception e) {
            return false;
        }finally {
            if (out!=null){
                out.close();
            }
        }
    }
}
