package cn.mldn.demo;

public class MyThread extends Thread{//线程是主体类
    private String title;
    public MyThread(String title){
        this.title=title;
    }
    @Override
    public void run() {//线程的主体方法
        for (int i=0;i<10;i++){
            System.out.println(this.title+"运行，i="+i);
        }
    }
}
