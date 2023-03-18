package com.itche.chapter03;

public class StringUtil {
    public static int[] count(String data){
        int count[]=new int[2];
        char []str=data.toCharArray();
        for(int i=0;i<str.length;i++){
            if (str[i]=='n'||str[i]=='N'){
                count[0]++;
            }
            if (str[i]=='o'||str[i]=='O'){
                count[1]++;
            }
        }
        return count;
    }
}
