package com.itche.chapter03;

public class MathUtil {
    public static double round(double num,int scale){
        return Math.round(Math.pow(10,scale)*num)/Math.pow(10,scale);
    }
}
