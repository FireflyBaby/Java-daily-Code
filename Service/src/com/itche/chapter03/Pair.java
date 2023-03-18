package com.itche.chapter03;

/**
 * 泛型接口的实现类是一个泛型类，那么要保证实现接口的泛型类的泛型标识包含泛型接口的泛型标识
 * @param <T>
 * @param <E>
 */
public class Pair<T,E> implements Generator<T>{
    private T key;
    private E value;

    public Pair(T key, E value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(T key) {
        this.key = key;
    }
    public T getKey() {
        return key;
    }
    public E getValue() {
        return value;
    }
    public void setValue(E value) {
        this.value = value;
    }

}
