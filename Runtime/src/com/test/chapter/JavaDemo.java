package com.test.chapter;

public class JavaDemo {
    public static void main(String[] args)throws Exception {
        Runtime run=Runtime.getRuntime();
        System.out.println("【1】MAX_MEMORY="+run.maxMemory());
        System.out.println("【1】TOTAL_MEMORY="+run.totalMemory());
        System.out.println("【1】FREE_MEMORY="+run.freeMemory());
        String str="";
        for (int i=0;i<30000;i++){
            str+=str;//产生大量垃圾空间
        }
        System.out.println("【2】MAX_MEMORY="+run.maxMemory());
        System.out.println("【2】TOTAL_MEMORY="+run.totalMemory());
        System.out.println("【2】FREE_MEMORY="+run.freeMemory());
        Thread.sleep(2000);
        run.gc();
        System.out.println("【3】MAX_MEMORY="+run.maxMemory());
        System.out.println("【3】TOTAL_MEMORY="+run.totalMemory());
        System.out.println("【3】FREE_MEMORY="+run.freeMemory());
    }
}
