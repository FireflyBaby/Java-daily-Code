package com.test.chapter;

import com.itche.chapter03.Array;
import com.itche.chapter03.ReverseArray;
import com.itche.chapter03.SortArray;

public class JavaDemo {
    public static void main(String[] args) {
        ReverseArray arr=new ReverseArray(-1);
        System.out.println(arr.add(10));
        System.out.println(arr.add(24));
        System.out.println(arr.add(2));
        System.out.println(arr.add(23));
        System.out.println(arr.add(6));
        arr.increment(3);
        System.out.println(arr.add(44));
        for (int before:arr.getBefore()){//数组倒序前
            System.out.print(before+" ");
        }
        System.out.println();
        for (int temp:arr.getData()) {//数组倒序后
            System.out.print(temp+" ");

        }


    }
}
