package com.apple.developer.overwrite.callable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum=0;
        for(int i=0;i<=100;i++){
            sum+=i;
            System.out.println(Thread.currentThread().getName()+"---->"+i);
        }
        return sum;
    }
}
