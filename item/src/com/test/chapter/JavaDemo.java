package com.test.chapter;

import com.itche.chapter03.Item;
import com.itche.chapter03.subItem;

public class JavaDemo {
    public static void main(String[] args) {
        Item item=new Item(1L,"图书");
        subItem subitchs[]=new subItem[]{
                new subItem(10L,"编程图书"),
                new subItem(10L,"图形图像类图书")
        };
        item.setSubItems(subitchs);//一个分类下有多个子分类
        for (int i=0;i< subitchs.length;i++){
            subitchs[i].setItem(item);
        }
        System.out.println(item.getInfo());
        for (int i=0;i<item.getSubItems().length;i++){
            System.out.println("\t-|"+item.getSubItems()[i].getInfo());
        }
    }
}
