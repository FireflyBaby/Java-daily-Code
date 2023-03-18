package com.itche.chapter01;

import java.lang.reflect.InvocationTargetException;

public class Factory {
    private Factory(){}
    public static <T> T getInstance(Class<T> clazz) {
        try {
            return (T) new MessageProxy().bind(clazz.getDeclaredConstructor().newInstance());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
