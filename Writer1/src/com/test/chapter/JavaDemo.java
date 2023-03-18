package com.test.chapter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class JavaDemo {
    public static void main(String[] args) throws IOException {
        File file=new File("d:"+File.separator+"hello"+File.separator+"mldn.txt");
        Writer out=new FileWriter(file);
        String str="www.mldn.cn";
        out.write(str);
        //out.close();
        out.flush();//强制性刷新
    }
}
