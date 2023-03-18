package com.itche.chapter03;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class inputProperties {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file=new File("d:\\zhurui.bat");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Dog dog = (Dog) ois.readObject();
        System.out.println("====反系列化后Dog信息=========");
        System.out.println(dog);
        System.out.println(ois.readUTF());
        ois.close();
    }
}
