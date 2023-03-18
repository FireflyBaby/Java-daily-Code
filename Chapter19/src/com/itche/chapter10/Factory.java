package com.itche.chapter10;

public class Factory {
    private Factory(){}
    public static INumberService getInstance(){
        return new NumberServiceImpl();
    }
}
