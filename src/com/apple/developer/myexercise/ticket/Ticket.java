package com.apple.developer.myexercise.ticket;
@SuppressWarnings("all")
public class Ticket {
    private int count;

    protected Ticket() {//无参构造
    }

    protected Ticket(int count) {//有参构造
        this.count = count;
    }

    protected int getCount() {
        return count;
    }

    public void sellTicket(){
        this.count-=1;
    }

}
