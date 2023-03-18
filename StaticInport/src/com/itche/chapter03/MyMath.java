package com.itche.chapter03;

public class MyMath {
    public static int add(int ...args){
        int sum=0;
        for (int num:args){
            sum+=num;
        }
        return sum;
    }
    public static int sub(int x,int y){
        return x-y;
    }
}
