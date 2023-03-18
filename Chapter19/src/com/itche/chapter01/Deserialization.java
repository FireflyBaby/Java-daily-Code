package com.itche.chapter01;
import com.itche.chapter.Dog;

import java.io.*;

public class Deserialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file=new File("d:"+File.separator+"朱瑞.bat");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());
        Dog dog= (Dog)ois.readObject();
        System.out.println("运行类型="+dog.getClass());
        System.out.println("dog信息="+dog);
        System.out.println("dog姓名="+dog.getName());
        ois.close();
    }
}
