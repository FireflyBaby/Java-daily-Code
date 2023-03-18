package com.itche.chapter11;

public class Factory {
    private Factory(){}
    public static IFileService getInstance(){
        return new FileServiceImpl();
    }
}
