package com.itche.chapter03;

public class Cashier {//收银台
    private IShopCar shopCar;
    public Cashier(IShopCar shopCar){
        this.shopCar=shopCar;
    }
    public double allPrice(){//计算总价
        double allPrice=0.0;
        Object result[]=shopCar.getAll();
        for (Object obj:result){
            IGoods goods=(IGoods) obj;
            allPrice+= goods.getPrice();
        }
        return allPrice;
    }
    public int allCount(){//商品数量
        return shopCar.getAll().length;
    }
}
