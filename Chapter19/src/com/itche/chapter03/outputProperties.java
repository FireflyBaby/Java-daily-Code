package com.itche.chapter03;

import java.io.*;
import java.util.Properties;

public class outputProperties {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("src\\com\\itche\\chapter03\\dog.properties"));
        String name =properties.get("name")+"";
        int age=Integer.parseInt(String.valueOf(properties.get("age")));
        String color=properties.get("color")+"";
        Dog dog = new Dog(name, age, color);
        System.out.println("=====Dog对象信息=======");
        System.out.println(dog);
        File file=new File("d:\\zhurui.bat");
        ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(dog);
        oos.writeUTF("沄沐，我喜欢你！");
        oos.close();
        System.out.println("序列化操作完成！");
    }
}
