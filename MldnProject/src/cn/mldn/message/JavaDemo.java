package cn.mldn.message;

public class JavaDemo {
    public static void main(String[] args) {
        if (args.length!=1){//没有得到输入参数
            System.out.println("程序执行错误，没有设置区域编码，正确格式：java JavaAPIDemo 选择项");
            System.exit(1);
        }
        int choose=Integer.parseInt(args[0]);
        System.out.println(new MessageUtil().getMessage(choose));
    }
}
