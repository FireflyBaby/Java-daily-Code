package com.itche.chapter03;
@FunctionalInterface
public interface IMath {
    public int add(int x,int y);
    public default void print(){
        System.out.println("测试");
    }
}
