package com.itche.chapter03;

public class ArrayUtil {
    public static int sum(int...data){
        int sum=0;
        for (int arr:data) {
            sum+=arr;
        }
        return sum;

    }
}
