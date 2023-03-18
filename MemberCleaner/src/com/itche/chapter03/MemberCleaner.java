package com.itche.chapter03;

import java.lang.ref.Cleaner;

public class MemberCleaner implements AutoCloseable{
    private static final Cleaner cleaner=Cleaner.create();//创建一个回收对象
    private Cleaner.Cleanable cleanable;//可以被回收的对象
    public MemberCleaner(Member member){//处理要回收的对象
        this.cleanable=cleaner.register(this,member);//注册一个可回收对象
    }
    @Override
    public void close() throws Exception {//释放资源
        this.cleanable.clean();//回收对象
    }
}
