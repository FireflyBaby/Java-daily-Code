package com.test.chapter;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class JavaDemo {
    public static void main(String[] args) throws IOException {
        File file=new File("d:"+File.separator+"hello"+File.separator+"mldn.txt");
        //指定要操作文件的路径
        if (!file.getParentFile().exists()){//文件不存在
            file.getParentFile().mkdirs();//创建父目录
        }
        try(OutputStream output = new FileOutputStream(file,true)) {
            String str = "www.mldn.cn\r\n";//要输出的文件内容
            output.write(str.getBytes());//3.将字符串变为字节数组并输出
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
