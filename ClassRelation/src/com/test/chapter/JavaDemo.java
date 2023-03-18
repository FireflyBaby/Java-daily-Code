package com.test.chapter;

import com.itche.chapter03.Car;
import com.itche.chapter03.Person;

public class JavaDemo {
    public static void main(String[] args) {
        Person per=new Person("林强",29);
        Person perA=new Person("小明",3);
        Person perB=new Person("小芳",5);
        per.setChildren(new Person[]{perA,perB});
        Car car=new Car("宾利",8000000.00);
        per.setCar(car);//一个人有一辆车
        perA.setCar(new Car("小鹏汽车",240000.00));
        perB.setCar(new Car("特斯拉",500000.00));
        car.setPerson(per);//一辆车属于一个人
        System.out.println(per.getCar().getCarInfo());//代码链
        System.out.println(car.getPerson().getPersonInfo());
        for(int i=0;i<per.getChildren().length;i++){
            System.out.println("\t|-"+per.getChildren()[i].getPersonInfo());
            System.out.println("\t\t|-"+per.getChildren()[i].getCar().getCarInfo());
        }
    }
}
