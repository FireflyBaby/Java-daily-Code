package com.test.chapter;

import com.itche.chapter03.*;

public class JavaDemo {
    public static void main(String[] args) {
        IShopCar car=new ShopCarImpl();
        car.add(new Book("Java开发",79.9));
        car.add(new Book("Oracle开发",99.5));
        car.add(new Bag("小强背包",889.9));
        Cashier cas=new Cashier(car);
        System.out.println("总价格:"+cas.allPrice()+"、购买总数量:"+cas.allCount());
    }
}
