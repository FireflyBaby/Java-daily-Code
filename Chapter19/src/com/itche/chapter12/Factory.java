package com.itche.chapter12;

public class Factory {
    private Factory(){}
    public static IStringService getInstance(){
        return new StringServiceImpl();
    }
}
