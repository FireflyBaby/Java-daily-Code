package com.itche.chapter03;

public class ShopCarImpl implements IShopCar{
    private ILink<IGoods>allGoods=new LinkImpl<IGoods>();
    @Override
    public void add(IGoods goods) {
        this.allGoods.add(goods);
    }

    @Override
    public void delete(IGoods goods) {
        this.allGoods.remove(goods);
    }

    @Override
    public Object[] getAll() {
        return this.allGoods.toArray();
    }
}
