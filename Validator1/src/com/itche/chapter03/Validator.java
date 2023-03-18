package com.itche.chapter03;

public class Validator {
    public static boolean validateIP(String ip){
        if (ip==null||"".equals(ip)) {
            return false;
        }
        String regex="([12]?[0-9]?[0-9]\\.){3}([12]?[0-9]?[0-9])";
        if (ip.matches(regex)){//验证通过，还需要对ip地址进行拆分处理
            String result[]=ip.split("\\.");
            for (int x=0;x< result.length;x++){
                if (Integer.parseInt(result[x])>255){
                    return false;
                }
            }
        }else{
            return false;
        }
        return true;
    }
}
