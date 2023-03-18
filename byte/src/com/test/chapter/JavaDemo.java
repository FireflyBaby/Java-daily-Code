package com.test.chapter;

public class JavaDemo {
    public static void main(String[] args) {
        String str="wwwmldncn";
        byte[] result=str.getBytes();
        for (int i=0;i< result.length;i++){
            result[i]-=32;
        }
        System.out.println(new String(result));
        System.out.println(new String(result,0,3));
    }
}
