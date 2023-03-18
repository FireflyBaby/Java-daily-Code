package com.itheme.chapter03;

public class JavaDemo {
    public static void main(String[] args) {
        int data[]=new int[]{10,20,30};
        for (int temp:data) {//自动循环，将data数组每一个内容交给temp
            System.out.println(temp);
        }
    }
}
