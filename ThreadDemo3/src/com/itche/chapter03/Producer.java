package com.itche.chapter03;

public class Producer implements Runnable{
    private Resource resource;
    public Producer(Resource resource){
        this.resource=resource;
    }
    @Override
    public void run() {
        for (int x=0;x<50;x++){
            try {
                this.resource.make();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
