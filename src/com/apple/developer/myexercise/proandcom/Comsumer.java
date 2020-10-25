package com.apple.developer.myexercise.proandcom;

public class Comsumer implements Runnable{
    Hub hub;

    public Comsumer(Hub hub) {
        this.hub = hub;
    }

    @Override
    public void run() {
        for(int i=0;i<20;i++){
            hub.comsume();
        }
    }
}
