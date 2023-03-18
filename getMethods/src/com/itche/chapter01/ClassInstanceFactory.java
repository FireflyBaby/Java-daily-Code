package com.itche.chapter01;

import java.lang.reflect.InvocationTargetException;

public class ClassInstanceFactory {
    private ClassInstanceFactory(){}
    /**
     * 实例化对象的创建方法，该对象可以根据传入的字符串结构”属性：内容|属性：内容“
     * @param clazz 要进行反射实例化的Class类对象，有Class就可以反射实例化对象
     * @param value 要设置给对象的实例化内容
     * @return 一个已经配置好属性内容的Java类对象
     */
    public static <T>T create(Class<T> clazz,String value){
        //如果要想采用反射进行简单Java类对象属性设置的时候，类中必须要有无参构造
        try {
            T t =(T) clazz.getDeclaredConstructor().newInstance();
            BeanUtils.setValue(t,value);//通过反射设置属性
            return t;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
