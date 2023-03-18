package com.itche.chapter03;

public class exchangeArray {
    public static void sort(int arr[]){
        int num[]=new int[arr.length];
        int temp=arr.length-1;
        for(int i=0;i<arr.length;i++){

            num[temp--]=arr[i];
        }
        for (int array:num) {
            System.out.print(array+" ");
        }
    }
}
