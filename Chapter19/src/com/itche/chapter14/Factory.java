package com.itche.chapter14;

public class Factory {
    private Factory(){}
    public static INumberService getInstance(){
        return new NumberServiceImpl();
    }
}
