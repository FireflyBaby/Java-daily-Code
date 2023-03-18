package com.itche.chapter11;

import java.io.File;

public class IOCaseDemo {
    static {
        File file=new File(IFileService.SAVR_DIR);//路径，但是这个文件目录有可能不存在
        if (!file.exists()){
            file.mkdirs();//创建目录
        }
    }
    public static void main(String[] args) throws Exception {
        IFileService fileService=Factory.getInstance();
        System.out.println(fileService.save());
    }
}
