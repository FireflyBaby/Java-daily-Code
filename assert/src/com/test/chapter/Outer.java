package com.test.chapter;

public class Outer {
    private String msg="www.mldn.cn";//私有成员属性
    public void fun(){
        Inner in=new Inner();
        in.print();//调用内部类方法
        System.out.println(in.info);
    }
    class Inner{//在Outer类的内部定义了Inner类
        private String info="今天天气不好，要收衣服！";
        public void print(){
            System.out.println(Outer.this.msg);//msg是Outer类中的属性
        }

    }

}
