package com.test.chapter;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaDemo {
    public static void main(String[] args) throws ParseException {
        String birthday="1846-11-11 11:11:11.111";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date date=sdf.parse(birthday);
        System.out.println(date);


    }
}
