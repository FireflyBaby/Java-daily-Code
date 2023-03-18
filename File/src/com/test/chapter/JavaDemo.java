package com.test.chapter;

import com.itche.chapter03.MathUtil;

import java.io.File;
import java.text.SimpleDateFormat;

public class JavaDemo {
    public static void main(String[] args) throws Exception {
        File file = new File("d:" + File.separator);
        if (file.isDirectory()){//当前是一个目录
            File result[]=file.listFiles();//列出目录中的全部内容
            for (int x=0;x<result.length;x++){
                System.out.println(result[x]);
            }
        }
    }
}
