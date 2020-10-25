package com.apple.developer.myexercise.proandcom;

@SuppressWarnings("all")

public class Hub {
    private Boolean flag=false;
    private String goods=null;

    public synchronized void product(String goods){
        if(flag){
            System.out.println("消费者还未消费，因此生产者停止生产");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("生产了一个"+goods+"，通知消费者消费......");
        this.flag=true;
        this.goods=goods;
        notify();
    }

    public synchronized void comsume(){
        if(!flag){
            //System.out.println("生产者还未生产，因此消费者停止消费");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("消费者消费了产品"+this.goods+",通知生产者生产.......");
        this.flag=false;
        this.goods=null;
        notify();
    }
}
