package com.itche.chapter03;

public class JavaDemo {
    public static void main(String[] args) {
        Apple apple = new Apple();
        System.out.println(apple.getKey());
        System.out.println("----------------------------");
        Pair<String,Integer> pair=new Pair<>("沄沐",100);
        System.out.println(pair.getKey()+":"+pair.getValue());
    }
}
