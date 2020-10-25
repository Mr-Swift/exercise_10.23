package com.apple.developer.myexercise.ticket;



public class Test {
    public static void main(String[] args) {
        SellTicket sellTicket=new SellTicket();

        Runnable target=sellTicket;

        Thread thread01 = new Thread(target);
        Thread thread02=new Thread(target);
        Thread thread03=new Thread(target);

        thread01.setName("南京擎天科技");
        thread02.setName("中央门火车站");
        thread03.setName("南京南站");

        thread01.start();
        thread02.start();
        thread03.start();

    }
}
