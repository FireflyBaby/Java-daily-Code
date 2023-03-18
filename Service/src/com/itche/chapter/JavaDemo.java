package com.itche.chapter;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class JavaDemo {
    public static void main(String[] args) throws Exception {
        Class<?> cla=Person.class;//获取指定类的Class对象
        Constructor<?> constructor = cla.getConstructor(String.class,int.class);//获取全部构造
        Object obj=constructor.newInstance("小强",78);
        System.out.println(obj);
    }
}
