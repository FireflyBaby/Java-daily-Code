package com.itche.chapter15;

public class Factory {
    private Factory(){}
    public static IUserService getInstance(){
        return new UserServiceProxy(new UserServiceImpl());
    }
}
