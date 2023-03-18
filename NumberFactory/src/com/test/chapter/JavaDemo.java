package com.test.chapter;

import com.itche.chapter03.NumberFactory;

import java.util.Arrays;

public class JavaDemo {
    public static void main(String[] args) {
        int []result=NumberFactory.create(5);
        System.out.println(Arrays.toString(result));
    }
}
