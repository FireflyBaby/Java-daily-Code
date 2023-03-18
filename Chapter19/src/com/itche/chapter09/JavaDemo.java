package com.itche.chapter09;

import java.io.*;

public class JavaDemo {
    private static final File SAVE_FILE=new File("d:"+File.separator+"mldn.person");
    public static void main(String[] args) throws Exception {
//        saveObject(new Person("小喷嚏",78));
        System.out.println(loadObject());
    }
    public static void saveObject(Object obj)throws Exception{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SAVE_FILE));
        oos.writeObject(obj);
        oos.close();
    }
    public static Object loadObject()throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SAVE_FILE));
        Object obj=ois.readObject();//反序列化
        ois.close();
        return obj;

    }

}
