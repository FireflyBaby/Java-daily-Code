package com.itche.chapter;
import java.lang.ref.Cleaner;

public class MemberCleaning implements AutoCloseable{//实现清除的处理
    private static final Cleaner cleaner=Cleaner.create();//创建一个回收对象
    private  Cleaner.Cleanable cleanable;
    public MemberCleaning(Member member){//处理要回收的对象
        this.cleanable=cleaner.register(this,member);//注册一个可回收对象
    }
    @Override
    public void close() throws Exception {//释放资源
        this.cleanable.clean();//回收对象
    }
}
