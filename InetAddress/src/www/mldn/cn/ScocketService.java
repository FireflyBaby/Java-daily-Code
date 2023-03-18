package www.mldn.cn;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ScocketService {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("正在连接客户端......");
        Socket socket = serverSocket.accept();
        InputStream inputStream=socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();
        byte[] data=new byte[1024];
        int dataLen=0;
        while ((dataLen=inputStream.read(data))!=-1){
            System.out.println(new String(data,0,dataLen));
        }
        outputStream.write("客户端，我已经接收到你的信息".getBytes());
        socket.shutdownOutput();
        socket.close();
        inputStream.close();
        outputStream.close();
        serverSocket.close();
    }
}
