package com.test.cahpter;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class JavaDemo {
    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(new File("d:"+File.separator+"mldn-err.txt"));
        scan.useDelimiter("\n");//设置读取分隔符
        while (scan.hasNext()){
            System.out.println(scan.next());
        }
        scan.close();
    }
}
