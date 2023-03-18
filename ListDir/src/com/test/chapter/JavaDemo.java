package com.test.chapter;

import java.io.File;

public class JavaDemo {
    public static void main(String[] args) {
        File file=new File("d:"+File.separator+"mldn");//是一个目录
        listDir(file);
    }
    public static void listDir(File file){
        if (file.isDirectory()){//是一个目录
            File results[]=file.listFiles();//列出目录中的全部内容
            if (results!=null) {
                for (int x = 0; x < results.length; x++) {
                    listDir(results[x]);
                }
            }
        }
        System.out.println(file);//获得完整路径
        //file.delete();
    }
}
