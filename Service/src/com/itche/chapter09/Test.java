package com.itche.chapter09;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ArrayList<String>[] listArr=new ArrayList[5];
        ArrayList<String> strArr=new ArrayList<>();
        strArr.add("苏沄沐");
        listArr[0]=strArr;
        System.out.println(listArr[0].get(0));
        System.out.println("--------------------");
        Fruit<String> fruit=new Fruit<>(String.class,3);
        fruit.input(0,"苹果");
        fruit.input(1,"香蕉");
        fruit.input(2,"橘子");
        System.out.println(Arrays.toString(fruit.getArray()));
    }
}
