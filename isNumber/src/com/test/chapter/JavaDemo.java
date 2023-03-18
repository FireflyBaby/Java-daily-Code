package com.test.chapter;

public class JavaDemo {
    public static void main(String[] args) {
        String str="hell0world";
        System.out.println(isNumber(str)?"由数字组成":"不是由数字组成");
        System.out.println(isNumber("123")?"由数字组成":"不是由数字组成");
    }
    public static boolean isNumber(String str){
        char result[]=str.toCharArray();
        for(int i=0;i< result.length;i++){
            if(result[i]<'0'||result[i]>'9'){
                return false;
            }
        }
        return true;

    }

}
