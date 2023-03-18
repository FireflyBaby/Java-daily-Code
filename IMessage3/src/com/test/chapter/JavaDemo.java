package com.test.chapter;

import com.itche.chapter03.IMessage;
import com.itche.chapter03.NetMessage;

public class JavaDemo {
    public static void main(String[] args) throws Exception{
        try(IMessage nm=new NetMessage("www.mldn.cn")){
            nm.send();
        }catch (Exception e){}
    }
}
