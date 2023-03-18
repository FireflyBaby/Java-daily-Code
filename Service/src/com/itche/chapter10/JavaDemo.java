package com.itche.chapter10;

import java.lang.reflect.Constructor;

public class JavaDemo {
    public static void main(String[] args) throws Exception{
        Class<Person> personClass = Person.class;
        Constructor<Person> constructor = personClass.getConstructor(String.class);
        Person person = constructor.newInstance("苏沄沐");
        System.out.println(person.getClass().getSimpleName());
    }
}
