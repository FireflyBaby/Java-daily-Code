package com.itche.chapter;
import java.io.*;

public class Serialize {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file=new File("d:"+File.separator+"朱瑞.bat");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeInt(100);
        oos.writeBoolean(true);
        oos.writeChar('a');
        oos.writeDouble(9.6);
        oos.writeUTF("林奕言我喜欢你");
        oos.writeObject(new Dog("旺财",10));
        oos.close();

    }
}
