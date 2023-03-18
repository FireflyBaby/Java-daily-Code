package com.test.chapter;

public class JavaDemo {
    public static void main(String[] args) {
        String str="123";
        if (str.matches("\\d+")){
            int num=Integer.parseInt(str);
            System.out.println(2*num);
        }

    }

}
