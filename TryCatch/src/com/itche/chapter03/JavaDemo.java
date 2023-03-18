package com.itche.chapter03;

public class JavaDemo {
    public static void main(String[] args) {
        System.out.println("【1】****程序开始执行****");
        try{

            String[]temp= new String[]{"121","11"};
            int x=Integer.parseInt(temp[0]);
            int y=Integer.parseInt(temp[1]);
            System.out.println("****数学计算："+(x/0 ));
        }catch (ArithmeticException e){
            e.printStackTrace();//处理异常
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch (NumberFormatException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("【F】不管是否出现异常，我都会执行。");
        }
        System.out.println("****程序执行完毕*****");
    }
}
