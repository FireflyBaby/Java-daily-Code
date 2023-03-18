package com.test.chapter;
import com.itche.chapter03.MyThread;
import java.util.concurrent.FutureTask;

public class JavaDemo {
    public static void main(String[] args) throws Exception {
        FutureTask<String> task=new FutureTask<String>(new MyThread());
        new Thread(task).start();
        System.out.println("【线程返回数据】"+task.get());
    }
}
