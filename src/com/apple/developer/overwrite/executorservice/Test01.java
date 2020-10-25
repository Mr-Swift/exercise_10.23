package com.apple.developer.overwrite.executorservice;
@SuppressWarnings("all")
public class Test01 {
    public static void main(String[] args) {
        while(true){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            }).start();
        }
    }
}
