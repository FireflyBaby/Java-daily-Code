package com.itche.chapter11;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class FileServiceImpl implements IFileService{
    private String name;
    private String content;
    public FileServiceImpl() {
        this.name = InputUtil.getString("请输入保存文件名称：");
        this.content = InputUtil.getString("请输入保存文件的内容：");
    }
    @Override
    public boolean save(){
        File file=new File(IFileService.SAVR_DIR+this.name);
        PrintWriter out = null;
        try {
            out = new PrintWriter(new FileOutputStream(file));
            out.print(this.content);
            return true;
        } catch (FileNotFoundException e) {
            return false;
        }finally {
            if (out!=null){
                out.close();
            }
        }
    }
}
