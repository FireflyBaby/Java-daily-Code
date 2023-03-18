package com.itche.chapter03;

public class Factory {
    public static IFood getInstance(String classname){
        if ("Bread".equals(classname)){
            return new Bread();
        }else if ("Milk".equals(classname)){
            return new Milk();
        }else {
            return null;
        }

    }
}
