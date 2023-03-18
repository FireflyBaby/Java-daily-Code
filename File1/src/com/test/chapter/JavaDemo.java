package com.test.chapter;

import java.io.File;

public class JavaDemo {
    public static void main(String[] args) {
        File file=new File("d:"+File.separator+"test");
        long start=System.currentTimeMillis();
        renameDir(file);
        long end=System.currentTimeMillis();
        System.out.println("本次操作所花费的时间："+(end-start));
    }
    public static void renameDir(File file){
        if (file.isDirectory()){//是一个目录
            File results[]=file.listFiles();//列出子目录中的内容
            if (results!=null) {
                for (int x = 0; x < results.length; x++) {
                    renameDir(results[x]);
                }
            }
        }else {
            if (file.isFile()){//如果是文件则必须进行重命名
                //File newFile=new File(file.getParentFile());
                String fileName=null;
                if (file.getName().contains(".")) {
                    fileName = file.getName().substring(0, file.getName().lastIndexOf("."))+".txt";
                }else {
                    fileName=file.getName()+".txt";
                }
                File newFile=new File(file.getParentFile(),fileName);
                file.renameTo(newFile);//重命名
            }
        }
    }
}
