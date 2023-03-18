package cn.mldn.www;

import java.io.*;

public class StreamUtils {
    public static byte[] streamToByteArray(InputStream is) throws Exception{
        ByteArrayOutputStream bos= new ByteArrayOutputStream();
        byte[] data=new byte[1024];
        int len=0;
        while ((len=is.read(data))!=-1){
            bos.write(data,0,len);
        }
        bos.close();
        return bos.toByteArray();
    }
    public static String streamToString(InputStream is) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line=bufferedReader.readLine())!=null){
            stringBuilder.append(line+"\r\n");
        }
        return stringBuilder.toString();

    }
}
