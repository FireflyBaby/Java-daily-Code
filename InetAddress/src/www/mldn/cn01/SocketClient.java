package www.mldn.cn01;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class SocketClient {
    private static final BufferedReader KEYBOARD_INPUT=new BufferedReader(new InputStreamReader(System.in));
    public static String getString(String prompt) throws Exception{
        System.out.print(prompt);
        return KEYBOARD_INPUT.readLine();
    }
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);
        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();
        outputStream.write(getString("请输入要发送的内容：").getBytes());
        socket.shutdownOutput();
        byte[] data=new byte[1024];
        int dataLen=0;
        while ((dataLen=inputStream.read(data))!=-1){
            System.out.println(new String(data,0,dataLen));
        }
        socket.close();
        outputStream.close();
        System.out.println("客户端退出......");
    }
}
