package com.test.chapter;

import com.itche.chapter03.Member;
import com.itche.chapter03.MemberCleaner;

public class JavaDemo {
    public static void main(String[] args)throws Exception {
        Member mem=new Member();
        //mem=null;//当前的对象已经不再拥有指向了
        System.gc();
        try(MemberCleaner mc=new MemberCleaner(mem)){//进行对象回收处理
            //如果有需求则可以进行其它的处理操作
        }catch (Exception e){

        }
    }
}
