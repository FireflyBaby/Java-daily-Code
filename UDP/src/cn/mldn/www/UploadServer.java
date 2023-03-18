package cn.mldn.www;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务端在8888端口监听......");
        Socket socket = serverSocket.accept();
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        //将得到的byte数组写入到指定的路径就得到一个文件了
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File("src\\LinXi.jpg")));
        bos.write(bytes);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        writer.write("收到图片");
        writer.flush();
        socket.shutdownOutput();//写入结束标记
        writer.close();
        bos.close();
        bis.close();
        socket.close();
        serverSocket.close();



    }
}
