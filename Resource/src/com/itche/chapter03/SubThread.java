package com.itche.chapter03;

public class SubThread implements Runnable{
    private Resource resource;

    public SubThread(Resource resource) {
        this.resource=resource;
    }

    @Override
    public synchronized void run() {
        for (int x=0;x<50;x++){
            try {
                this.resource.sub();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
