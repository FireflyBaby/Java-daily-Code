package com.itche.chapter05;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class JavaDemo1 {
    public static void main(String[] args) throws IOException {
        File file=new File("d:"+File.separator+"yunmu.txt");
        RandomAccessFile raf= new RandomAccessFile(file, "rw");
        {
            raf.skipBytes(24);
            byte[] data = new byte[8];
            int len = raf.read(data);
            System.out.println("姓名：" + new String(data, 0, len).trim() + "、年龄：" + raf.readInt());
        }
        {//读取王五的数据
            raf.seek(12);
            byte[] data=new byte[8];
            int len= raf.read(data);
            System.out.println("姓名：" + new String(data, 0, len).trim() + "、年龄：" + raf.readInt());
        }
        {//读取王五的数据
            raf.seek(0);
            byte[] data=new byte[8];
            int len= raf.read(data);
            System.out.println("姓名：" + new String(data, 0, len).trim() + "、年龄：" + raf.readInt());
        }
        raf.close();
    }
}
