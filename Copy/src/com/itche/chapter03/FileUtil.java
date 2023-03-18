package com.itche.chapter03;

import java.io.*;

public class FileUtil {//定义一个文件操作的工具类
    private File srcFile;//源文件路径
    private File desFile;//目标文件路径


    public FileUtil(String src,String des){
        this(new File(src),new File(des));
    }

    public FileUtil(File stcFile, File desFile) {
        this.srcFile = stcFile;
        this.desFile = desFile;
    }
    public boolean copyDir() throws  IOException{
        try{
            this.copyImpl(this.srcFile);
            return true;
        }catch (Exception e){
            return false;
        }

    }
    public void copyImpl(File file) throws IOException{//递归操作
        if (file.isDirectory()){//是目录
            File results[]=file.listFiles();//列出全部目录组成
            if (results!=null){
                for (int x=0;x<results.length;x++){
                    copyImpl(results[x]);
                }
            }
        }else {//是文件
            String newFilePath=file.getPath().replace(this.srcFile.getPath()+File.separator,"");
            File newFile=new File(this.desFile,newFilePath);//拷贝的目标路径
            this.copyFileImpl(file,newFile);
        }
    }
    public boolean copyFileImpl(File srcFile,File desFile)throws IOException{
        if (!desFile.getParentFile().exists()) {
            desFile.getParentFile().mkdirs();//创建父目录
        }
        InputStream input = null;
        OutputStream output = null;
        try {
            input = new FileInputStream(srcFile);
            output = new FileOutputStream(desFile);
            input.transferTo(output);
            return true;
        } catch (IOException e) {
            throw e;
        } finally {
            if (input != null) {
                input.close();
            }
            if (output != null) {
                output.close();
            }
        }
    }
    public boolean copy() throws IOException {//文件拷贝处理
        if (!this.srcFile.exists()) {//源文件不存在
            System.out.println("拷贝的源文件不存在！");
            return false;//拷贝失败
        }
       return this.copyFileImpl(this.srcFile,this.desFile);
    }
}
