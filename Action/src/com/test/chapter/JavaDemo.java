package com.test.chapter;

import com.itche.chapter03.Action;
import com.itche.chapter03.Person;
import com.itche.chapter03.Pig;
import com.itche.chapter03.Robot;

public class JavaDemo {
    public static void main(String[] args) {
        Action robotAction=new Robot();
        Action personAction=new Person();
        Action pigAction=new Pig();
        System.out.println("-----------机器人的行为-------------");
        robotAction.command(Action.SLEEP);
        robotAction.command(Action.WORK);
        System.out.println("-----------人的行为-------------");
        personAction.command(Action.EAT+Action.WORK+Action.SLEEP);
        System.out.println("-----------猪类的行为-------------");
        pigAction.work();
        pigAction.eat();
    }
}
