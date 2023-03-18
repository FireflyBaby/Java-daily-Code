package com.itche.chapter01;

import java.lang.reflect.Method;

public class JavaDemo {
    public static void main(String[] args) throws Exception{
        MLDNClassLoader mldnClassLoader = new MLDNClassLoader();//实例化自定义类加载器
        Class<?> cls=mldnClassLoader.loadData("com.itche.chapter01.Message");//进行类的加载
        System.out.println(cls.getClassLoader());
        System.out.println(cls.getClassLoader().getParent());
        System.out.println(cls.getClassLoader().getParent().getParent());
    }
}
