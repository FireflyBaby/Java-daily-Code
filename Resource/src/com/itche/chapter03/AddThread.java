package com.itche.chapter03;

public class AddThread implements Runnable{
    private Resource resource;

    public AddThread(Resource resource) {
        this.resource=resource;
    }

    @Override
    public synchronized void run() {
        for(int x=0;x<50;x++){
            try {
                this.resource.add();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
