package com.test.chapter;

import com.itche.chapter03.Cat;
import com.itche.chapter03.Dog;
import com.itche.chapter03.PetShop;

public class JavaDemo {
    public static void main(String[] args) {
        PetShop shop=new PetShop();//开店
        shop.add(new Dog("黄斑狗","绿色"));
        shop.add(new Cat("小强猫","深绿色"));
        shop.add(new Cat("黄猫","深色"));
        shop.add(new Dog("黄狗","黄色"));
        shop.add(new Dog("斑点狗","灰色"));
        Object result[]=shop.search("黄").toArray();
        for (Object obj:result){
            System.out.println(obj);
        }

    }
}
