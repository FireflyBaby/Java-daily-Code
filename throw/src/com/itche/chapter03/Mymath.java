package com.itche.chapter03;

public class Mymath {
    public static int div(int x,int y)throws Exception{
        int temp=0;
        System.out.println("【START】除法计算开始。");
        try {
            temp=x/y;
        }catch (Exception e){
            throw e;//向上抛异常对象
        }finally {
            System.out.println("【END】除法计算结束。");
        }
        return temp;
    }
}
