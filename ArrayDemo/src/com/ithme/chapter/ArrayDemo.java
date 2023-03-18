package com.ithme.chapter;

public class ArrayDemo {
    public static void main(String[] args) {
        //使用数组的静态初始化
        int data[]=new int[]{10,20,30};
        int temp[]=data;//引用传递
        temp[0]=99;
        for(int i=0;i<data.length;i++){
            System.out.println(data[i]);
        }
    }
}
