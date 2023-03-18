package com.test.chapter;

public class JavaDemo {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        Runtime run=Runtime.getRuntime();
        String str="";
        for (int i=0;i<30000;i++){
            str+=i;
        }
        long end=System.currentTimeMillis();
        System.out.println("操作耗时："+(end-start));
    }
}
