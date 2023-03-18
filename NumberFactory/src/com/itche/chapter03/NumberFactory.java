package com.itche.chapter03;

import java.util.Random;

public class NumberFactory {
    private static Random random=new Random();
    public static int [] create(int len){
        int data[]=new int[len];//开辟新的数组
        int foot=0;
        while (foot<data.length){
            int num=random.nextInt(30);
            if (num!=0) {
                data[foot++] = num;
            }
        }
        return data;
    }
}
