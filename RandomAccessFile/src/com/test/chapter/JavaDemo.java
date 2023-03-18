package com.test.chapter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class JavaDemo {
    public static void main(String[] args) throws IOException {
        File file=new File("d:"+File.separator+"mldn.txt");//定义操作文件
        RandomAccessFile raf=new RandomAccessFile(file,"rw");//读写模式
        {
            raf.skipBytes(12);
            byte[] data = new byte[8];
            int len = raf.read(data);
            System.out.println("姓名：" + new String(data, 0, len).trim() + "年龄："+raf.readInt());
        }
        {
            raf.seek(0);
            byte[] data = new byte[8];
            int len = raf.read(data);
            System.out.println("姓名：" + new String(data, 0, len).trim() + "年龄："+raf.readInt());
        }
        {
            raf.skipBytes(12);
            byte[] data = new byte[8];
            int len = raf.read(data);
            System.out.println("姓名：" + new String(data, 0, len).trim() + "年龄："+raf.readInt());
        }
        raf.close();
    }
}
