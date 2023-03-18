package com.itche.chapter03;

public class arrayUtil {
    public static void printArray(int num[]){
        for (int arr:num) {
            System.out.print(arr+" ");
        }
    }
    public static void arraycopy(int src[],int sindex,int dsc[],int dindex,int len){
        for (int x=0;x<len;x++){
            dsc[dindex++]=src[sindex++];
        }
    }
}
