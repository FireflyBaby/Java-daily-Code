package com.test.chapter;

import com.itche.chapter03.Person;

import java.io.*;

public class JavaDemo {
    private static final File SAVE_FILE=new File("D:"+File.separator+"mldn.person");
    public static void main(String[] args) throws Exception {
        //saveObject(new Person("小喷嚏",78));
        System.out.println(loadObject());
    }
    public static void saveObject(Object obj) throws Exception {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(SAVE_FILE));
        oos.writeObject(obj);//序列化
        oos.close();
    }
    public static Object loadObject() throws Exception{
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(SAVE_FILE));
        Object obj=ois.readObject();//反序列化
        ois.close();
        return obj;
    }
}
