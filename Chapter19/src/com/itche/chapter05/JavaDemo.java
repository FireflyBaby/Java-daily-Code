package com.itche.chapter05;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class JavaDemo {
    public static void main(String[] args) throws IOException {
        File file=new File("d:"+File.separator+"yunmu.txt");
        RandomAccessFile raf= new RandomAccessFile(file, "rw");
        String names[]=new String[]{"zhangsan","wangwu  ","lisi    "};
        int[] age=new int[]{30,20,16};
        for (int x=0;x< names.length;x++){
            raf.write(names[x].getBytes());
            raf.writeInt(age[x]);
        }
        raf.close();
    }
}
