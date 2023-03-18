package com.itche.chapter;

import java.util.Locale;

public class JavaDemo {
    public static void main(String[] args) {
        String strA="www.mldn.cn";
        String strB="www".concat(".mldn").concat(".cn");
        String strC="";
        System.out.println(strB);
        System.out.println(strA==strB);
        System.out.println("mldn".isEmpty());
        System.out.println(strC.isEmpty());
        String strD="    hello world   ";
        System.out.println(strD);
        System.out.println(strD.length());
        String trimStr=strD.trim();
        System.out.println(trimStr);
        System.out.println(trimStr.length());
        String strE="Hello World!!！";
        System.out.println(strE.toUpperCase());
        System.out.println(strE.toLowerCase());


    }
}
