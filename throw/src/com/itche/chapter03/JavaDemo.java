package com.itche.chapter03;

public class JavaDemo {
    public static void main(String[] args) {
        try{
            System.out.println(Mymath.div(10,0));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
