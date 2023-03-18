package com.test.chapter;

public class JavaDemo {
    public static void main(String[] args) {
        String str="192.168 .11";
        //字符串拆分
        String []result=str.split("\\.");
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
        //字符串截取

        System.out.println(str.substring(4,8));
    }

}
