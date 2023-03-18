package com.test.chapter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class JavaDemo {
    public static void main(String[] args) throws IOException {
        File file=new File("d:"+File.separator+"hello"+File.separator+"mldn.txt");
        if (!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }
        Writer out=new FileWriter(file,false);
        String str="www.mldn.cn\r\n";
        out.write(str);
        out.append("中国人民万岁！");//追加输出内容
        out.close();
    }
}
