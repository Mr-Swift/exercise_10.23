package com.apple.developer.overwrite.executorservice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
       ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
       for(int i=0;i<100;i++){
           int index=i;
           newCachedThreadPool.submit(new Callable() {
               @Override
               public Object call() throws Exception {
                   System.out.println(Thread.currentThread().getName()+"--->"+index);
                   return null;
               }
           });
       }
       newCachedThreadPool.shutdown();
    }
}
