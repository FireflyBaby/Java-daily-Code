package com.itche.chapter04;

import java.util.ArrayList;
import java.util.Random;

public class ProductGetter <T>{
    Random random=new Random();
    ArrayList<T> list=new ArrayList<>();
    private T product;
    public void addProduct(T t){
        list.add(t);
    }
    public T getProduct(){
        return list.get(random.nextInt(list.size()));
    }
    public <E>E getProduct(ArrayList<E> list){
        return list.get(random.nextInt(list.size()));
    }
    public static <E,R,F> void printType(E e,R r,F f){
        System.out.println(e+"\t"+e.getClass().getSimpleName());
        System.out.println(r+"\t"+r.getClass().getSimpleName());
        System.out.println(f+"\t"+f.getClass().getSimpleName());
    }
    public static <E> void print(E...e){
        for (int x=0;x<e.length;x++){
            System.out.println(e[x]+"\t"+e[x].getClass().getSimpleName());
        }
    }
}
