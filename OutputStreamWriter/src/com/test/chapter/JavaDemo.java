package com.test.chapter;

import java.io.*;

public class JavaDemo {
    public static void main(String[] args) throws IOException {
        File file=new File("d:"+File.separator+"hello"+File.separator+"mldn.txt");
        if (!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        OutputStream output=new FileOutputStream(file);
        Writer out=new OutputStreamWriter(output);//字节流变为字符流
        out.write("www.mldn.cn");//直接输出字符串，字符流适合于处理中文
        out.close();
        output.close();
    }
}
