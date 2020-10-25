package com.apple.developer.overwrite.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTest {
    public static void main(String[] args) {
        MyCallable myCallable=new MyCallable();
        Callable callable;
        FutureTask futureTask=new FutureTask<>(myCallable);
        Thread thread0=new Thread(futureTask);
        thread0.setName("thread-0");
        thread0.start();

        try {
            System.out.println("1~100求和的值为："+futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
