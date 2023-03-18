package com.test.chapter;

import com.itche.chapter.Member;
import com.itche.chapter.MemberCleaning;

public class JavaDemo {
    public static void main(String[] args)throws Exception {
        Member mem=new Member();//诞生
        System.gc();
        System.out.println("太阳照常升起，地球照样转动。");
        try(MemberCleaning mc=new MemberCleaning(mem)){//进行对象回收处理
            //如果有需求则可以进行其它的处理操作
        }catch (Exception e){
        }
    }
}
