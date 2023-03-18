package com.itche.chapter03;

public class Consumer implements Runnable{
    private Resource resource;
    public Consumer(Resource resource){
        this.resource=resource;
    }
    @Override
    public void run() {
        for (int x=0;x<50;x++){
            try {
                this.resource.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
