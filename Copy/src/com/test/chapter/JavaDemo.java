package com.test.chapter;

import com.itche.chapter03.FileUtil;

import java.io.File;
import java.io.IOException;

public class JavaDemo {
    public static void main(String[] args)throws IOException {
        if (args.length != 2) {//程序执行出错
            System.out.println("命令执行错误，执行结构：java JavaDemo 拷贝源文件路径  拷贝目标文件路径");
            System.exit(1);
        }
        long start = System.currentTimeMillis();
        FileUtil fu = new FileUtil(args[0], args[1]);
        if (new File(args[0]).isFile()) {//文件拷贝
            System.out.println(fu.copy() ? "文件拷贝成功！" : "文件拷贝失败！");
        }else{//目录拷贝
            System.out.println(fu.copyDir() ? "目录拷贝成功！" : "目录拷贝失败！");
        }
        long end = System.currentTimeMillis();
        System.out.println("拷贝所用时间：" + (end - start));
    }
}
