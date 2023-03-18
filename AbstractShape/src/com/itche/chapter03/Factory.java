package com.itche.chapter03;

public class Factory{
    public static AbstractShape getInstance(String className,double ...agrs){
        if("Circular".equalsIgnoreCase(className)){
            return new Circular(agrs[0]);
        }else if ("Rectangle".equalsIgnoreCase(className)){
            return new Rectangle(agrs[0],agrs[1]);
        }else {
            return null;
        }
    }
}
