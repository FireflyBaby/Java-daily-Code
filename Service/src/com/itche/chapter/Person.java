package com.itche.chapter;

import com.itche.chapter01.AbstractBase;
import com.itche.chapter01.IChannelService;
import com.itche.chapter01.IMessageService;

public class Person extends AbstractBase implements IMessageService, IChannelService {
    private String name;
    private int age;
    public Person(){}
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public boolean connect() {
        return true;
    }
    @Override
    public void send() {
        if (this.connect()){
            System.out.println("【信息发送】www.mldn.cn");
        }
    }
    @Override
    public String toString() {
        return "姓名："+this.name+"、年龄："+this.age;
    }
}
