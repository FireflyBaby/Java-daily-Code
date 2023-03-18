package com.itche.chapter03;

public class exchangeArray {
    public static void sort(int num[]){

        for (int i=0;i<= (num.length/2)-1;i++){
           int temp=num[i];
           num[i]=num[num.length-1-i];
           num[num.length-1-i]=temp;
        }
        for (int arr:num) {
            System.out.print(arr+" ");
        }
    }
}
