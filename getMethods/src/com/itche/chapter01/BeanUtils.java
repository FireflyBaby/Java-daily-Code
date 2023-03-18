package com.itche.chapter01;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BeanUtils {//进行Bean处理的类
     private BeanUtils(){}
    /**
     * 实现指定对象的属性设置
     * @param obj 要进行反射操作的实例化对象
     * @param value 包含有指定内容的字符串，格式”属性:内容|属性:内容“
     */
    public static void setValue(Object obj,String value){
        String results[]=value.split("\\|");
        for (int x=0;x< results.length;x++){
            String[] attvals = results[x].split(":");//获取属性名称与内容
            try {
                if (attvals[0].contains(".")){//多级配置
                    String[] temp=attvals[0].split("\\.");
                    Object currentObject=obj;
                    //最后一位肯定是指定类中的属性名称，所以不在本次实例化处理的范畴之内
                    for (int y=0;y< temp.length-1;y++){//实例化
                        //调用相应的getter方法，如果getter方法返回了null，表示该对象未实例化
                        Method getMethod = currentObject.getClass().getDeclaredMethod("get" + StringUtils.initcap(temp[y]));
                        Object tempObject=getMethod.invoke(currentObject);
                        if (tempObject==null){//该对象现在并没有实例化
                            Field field = currentObject.getClass().getDeclaredField(temp[y]);//获取属性类型
                            Method Method = currentObject.getClass().getDeclaredMethod("set" + StringUtils.initcap(temp[y]), field.getType());
                            Object newObject=field.getType().getConstructor().newInstance();
                            Method.invoke(currentObject,newObject);
                            currentObject=newObject;
                        }else {
                            currentObject=tempObject;
                        }
                        System.out.println(temp[y]+"--"+currentObject);
                    }
                    Field field = currentObject.getClass().getDeclaredField(temp[temp.length-1]);
                    Method setMethid = currentObject.getClass().getDeclaredMethod("set" + StringUtils.initcap(temp[temp.length-1]), field.getType());
                    Object convertValue = BeanUtils.ConvertAttributeValue(field.getType().getName(), attvals[1]);
                    setMethid.invoke(currentObject, convertValue);//调用setter方法设置内容

                }else {
                    Field field = obj.getClass().getDeclaredField(attvals[0]);
                    Method setMethid = obj.getClass().getDeclaredMethod("set" + StringUtils.initcap(attvals[0]), field.getType());
                    Object convertValue = BeanUtils.ConvertAttributeValue(field.getType().getName(), attvals[1]);
                    setMethid.invoke(obj, convertValue);//调用setter方法设置内容
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    /**
     * 实现属性类型转换处理
     * @param type 属性类型，通过Field获取
     * @param value 属性内容，传入的都是字符串，需要将其变为指定类型
     * @return 转换后的数据
     */
    private static Object ConvertAttributeValue(String type,String value){
        System.out.println("type="+type+"、value="+value);
        if ("long".equals(type)||"java.lang.Long".equals(type)){//长整型
            return Long.parseLong(value);
        }else if ("int".equals(type)||"java.lang.int".equals(type)){
            return Integer.parseInt(value);
        }else if ("double".equals(type)||"java.lang.Double".equals(type)){
            return Double.parseDouble(value);
        }else if("java.util.Date".equals(type)){
            SimpleDateFormat sdf=null;
            if (value.matches("\\d{4}-\\d{2}-\\d{2}")){//日期类型
                sdf=new SimpleDateFormat("yyyy-MM-dd");
            }else if (value.matches("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}")){
                sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            }else {
                return new Date();//当前日期
            }
            try {
                return sdf.parse(value);
            } catch (ParseException e) {
                return new Date();//当前日期
            }
        }else {
            return value;
        }
    }
}
