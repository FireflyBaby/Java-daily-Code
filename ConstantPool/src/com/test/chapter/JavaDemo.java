package com.test.chapter;

public class JavaDemo {
    public static void main(String[] args) {
        String str="helloworld";
        char result[]=str.toCharArray();
        for(int i=0;i<result.length;i++){
            result[i]-=32;
        }
        String str1=new String(result);
        String newStr=new String(result,0,5);
        System.out.println(str1);
        System.out.println(newStr);

    }
}
