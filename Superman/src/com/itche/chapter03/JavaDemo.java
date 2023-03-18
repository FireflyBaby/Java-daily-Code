package com.itche.chapter03;

import com.test.chapter.Person;
import com.test.chapter.Superman;

public class JavaDemo {
    public static void main(String[] args) {
        System.out.println("————————正常状态下的超人是个普通人的状态——————————");
        Person per=new Superman();//向上转型
        per.print();
        System.out.println("————————外星怪兽狗骚扰地球，准备消灭人类——————————");
        if (per instanceof Superman){
            Superman man=(Superman) per;//向下转型
            System.out.println(man.fly());
            System.out.println(man.fire());
        }

    }
}
