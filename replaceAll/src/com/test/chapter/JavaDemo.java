package com.test.chapter;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class JavaDemo {
    public static void main(String[] args) throws ParseException {
        String str="mldnjava888@mldn.cn";
        String regex="[a-zA-Z0-9]\\w+@\\w+\\.(cn|com|com.cn|gov)";
        System.out.println(str.matches(regex));
    }
}
