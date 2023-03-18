package com.test.chapter;

import com.itche.chapter03.Coin;

import java.util.Random;

public class JavaDemo {
    public static void main(String[] args) {
        Coin coin=new Coin();
        coin.throwCoin(1000);
        System.out.println("正面出现次数："+coin.getFront());
        System.out.println("背面出现次数："+coin.getBack());
    }
}
