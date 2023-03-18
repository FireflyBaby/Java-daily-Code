package com.mldn.chapter01;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;//1、导入程序所在的包.类，知道对象的出处
interface IMessage{
    public void send();//消息发送
}
interface Iservice{
    public void service();
}
class NetMessage implements IMessage{
    @Override
    public void send() {
        System.out.println("【网络消息发送】www.mldn.cn");
    }
}
class CloudMessage implements IMessage{
    @Override
    public void send() {
        System.out.println("【云消息】www.mldnjava.cn");
    }
}
class HouseService implements Iservice{
    @Override
    public void service() {
        System.out.println("【服务】为您的住宿提供服务");
    }
}
public class JavaDemo {
    public static void main(String[] args) throws Exception {
        IMessage msg=Factory.getInstance("com.mldn.chapter01.NetMessage",IMessage.class);
        msg.send();
        Iservice service=Factory.getInstance("com.mldn.chapter01.HouseService",Iservice.class);
        service.service();
    }
}
class Factory{
    private Factory(){}//没有产生实例化对象的意义，所以构造方法私有化
    /**
     *获取接口实例化对象
     * @param className 接口的子类
     * @param clazz 描述的是一个接口的类型
     * @return 如果子类存在则返回指定接口实例化对象
     */
    public static <T>T getInstance(String className,Class<T> clazz){
        T instance=null;
        try {
            instance=(T) Class.forName(className).getDeclaredConstructor().newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        return instance;
    }
}
