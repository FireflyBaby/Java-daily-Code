package com.itche.chapter09;

import java.lang.reflect.Array;

public class Fruit <T>{
    private T[] array;
    public Fruit(Class<T> clz,int length){
        array=(T[]) Array.newInstance(clz, length);//通过Array.newInstance()创建泛型数组
    }
    /**
     * 填充数组
     * @param index
     * @param item
     */
    public void input(int index,T item){
        array[index]=item;
    }
    public T[] getArray() {
        return array;//返回数组
    }
}
