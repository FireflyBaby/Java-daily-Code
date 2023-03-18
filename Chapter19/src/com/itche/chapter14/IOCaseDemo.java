package com.itche.chapter14;

import java.util.Arrays;

public class IOCaseDemo {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Factory.getInstance().stat()));
    }
}
