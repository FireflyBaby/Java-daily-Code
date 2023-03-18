package com.itche.chapter03;

public class Food {
    public static void eat(int num) throws BombException{
        if(num>10){
            throw new BombException("吃太多了，肚子爆了。");
        }else {
            System.out.println("开始正常吃，不怕吃胖。");
        }
    }
}
