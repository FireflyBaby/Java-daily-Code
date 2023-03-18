package com.test.chapter;

public class JavaDemo {
    public static void main(String[] args) {
        String strA="mldn";
        String strB="**@@www.mldn.cn";
        System.out.println(strA.equals(strB));
        System.out.println(strA.equalsIgnoreCase(strB));
        System.out.println(strA.compareTo(strB));
        System.out.println(strA.compareToIgnoreCase(strB));
        System.out.println(strB.contains("mldn"));
        System.out.println(strB.lastIndexOf("."));
        System.out.println(strB.lastIndexOf(".",7));
        System.out.println(strB.startsWith("**"));
        System.out.println(strB.startsWith("@@",2));
    }
}
