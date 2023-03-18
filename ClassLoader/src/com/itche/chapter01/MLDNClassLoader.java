package com.itche.chapter01;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class MLDNClassLoader extends ClassLoader{
    private static final String MESSAFE_CLSS_PATH="D:"+ File.separator+"Message.class";
    /**
     *  进行指定类的加载
     * @param className 类的完整名称“包.类”
     * @return 返回一个指定类的Class对象
     * @throws Exception 如果类文件不存在，则无法加载
     */
    public Class<?> loadData(String className) throws Exception{
        byte[] data=this.loadClassData();//读取二进制数据文件
        if (data!=null){//读取到了
            return super.defineClass(className,data,0,data.length);
        }
        return null;
    }
    private byte[] loadClassData()throws Exception{//通过文件进行类的加载
        InputStream input=null;
        ByteArrayOutputStream bos=null;//
        byte data[]=null;
        try{
            bos=new ByteArrayOutputStream();
            input=new FileInputStream(new File(MESSAFE_CLSS_PATH));//文件流加载
            byte[] result=new byte[1024];
            int length=0;
            while ((length=input.read(result))!=-1){
                bos.write(result,0,length);
            }
            data= bos.toByteArray();
//            input.transferTo(bos);//读取数据
//            data=bos.toByteArray();//将所有读取到的字节数据取出

        }catch (Exception e){

        }finally {
            if (input!=null){
                input.close();
            }
            if (bos!=null){
                bos.close();
            }
        }
        return data;
    }
}
