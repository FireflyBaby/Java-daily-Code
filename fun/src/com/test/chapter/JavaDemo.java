package com.test.chapter;

public class JavaDemo {
    public static void main(String[] args) {
        Integer num[]=fun(1,2,3);//传入了整数，泛型类型就是Integer
        for (int temp:num) {
            System.out.print(temp+" ");
        }

    }
    public static <T>T[] fun(T ...args){
        return args;
    }
}
