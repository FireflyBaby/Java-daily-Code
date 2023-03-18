package com.itche.chapter03;

public class Print implements IUsb{
    @Override
    public boolean check() {
        return false;
    }

    @Override
    public void work() {
        System.out.println("开始进行照片打印。");

    }
}
