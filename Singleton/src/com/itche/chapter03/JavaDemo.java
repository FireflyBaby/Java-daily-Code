package com.itche.chapter03;

public class JavaDemo {
    public static void main(String[] args) {
        Singleton instance=null;//声明对象
        instance=Singleton.getInstance();
        instance.print();
    }
}
