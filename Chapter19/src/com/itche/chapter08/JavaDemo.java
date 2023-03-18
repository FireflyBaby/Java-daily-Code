package com.itche.chapter08;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class JavaDemo {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(new File("d:"+File.separator+"zhurui.txt"));
        while(scanner.hasNext()){
            scanner.useDelimiter("\n");
            System.out.println(scanner.next());
        }
        scanner.close();

    }
}
