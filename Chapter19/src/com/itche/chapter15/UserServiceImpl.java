package com.itche.chapter15;

public class UserServiceImpl implements IUserService{
    private int count=0;//作为登录统计
    @Override
    public boolean isExit() {
        return this.count>=3;//执行登录退出的条件
    }
    @Override
    public boolean login(String name, String password) {
        this.count++;
        return "mldn".equals(name)&&"hello".equals(password);
    }
}
