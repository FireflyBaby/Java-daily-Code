package com.itche.chapter08;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) {
        Erasure<Integer> erasure=new Erasure<>();
        Class<? extends Erasure> aClass = erasure.getClass();//利用反射获取Erasure类的字节码文件的Class类对象
        Field[] declaredFields = aClass.getDeclaredFields();//获取所有的成员变量
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName()+":"+declaredField.getType().getSimpleName());//打印成员变量的名称和类型
        }
        System.out.println("-------------------------");
        Method[] declaredMethods = aClass.getDeclaredMethods();//获取所有的方法
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName()+":"+declaredMethod.getReturnType().getSimpleName());//打印方法名和返回值类型
        }
        System.out.println("-------------------------");
        Class<InfoImpl> infoClass = InfoImpl.class;
        Method[] infoImplMethods = infoClass.getDeclaredMethods();
        for (Method infoImplMethod : infoImplMethods) {
            System.out.println(infoImplMethod.getName()+"："+infoImplMethod.getReturnType().getSimpleName());
        }

    }
}
