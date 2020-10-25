package com.apple.developer.myexercise.proandcom;

public class Test {
    public static void main(String[] args) {
        Hub hub=new Hub();

        Productor productor = new Productor(hub);
        Comsumer comsumer=new Comsumer(hub);

        Thread thread01=new Thread(productor);
        Thread thread02=new Thread(comsumer);

        thread02.start();
        thread01.start();

    }
}
