package cn.mldn.www;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class UploadClient {
    public static void main(String[] args) throws Exception{
        Socket client = new Socket(InetAddress.getLocalHost(), 8888);
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("d:" + File.separator + "yunmu.jpg")));
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        //通过Socket获取到输出流，将bytes数据发送到服务端
        BufferedOutputStream bos = new BufferedOutputStream(client.getOutputStream());
        bos.write(bytes);//将文件对应的字节数组的内容写入到数据通道
        bis.close();
        client.shutdownOutput();//设置写入数据的结束标志
        InputStream inputStream = client.getInputStream();
        String s = StreamUtils.streamToString(inputStream);
        System.out.println(s);
        bos.close();
        inputStream.close();
        client.close();
    }
}
