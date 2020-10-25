package com.apple.developer.myexercise.proandcom;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Productor implements Runnable{
    Hub hub;

    public Productor(Hub hub) {

        this.hub = hub;
    }

    @Override
    public void run() {
        List<String> list=new ArrayList();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        for(int i=0;i<20;i++){
            String msg= list.get(new Random().nextInt(list.size()));
            hub.product(msg);
        }

    }
}
