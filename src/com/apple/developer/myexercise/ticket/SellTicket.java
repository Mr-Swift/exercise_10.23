package com.apple.developer.myexercise.ticket;

@SuppressWarnings("all")
public class SellTicket implements Runnable {
    private Ticket ticket = new Ticket(10);

    @Override
    public void run() {
        out:
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized(ticket) {
                if (ticket.getCount() > 0) {
                    ticket.sellTicket();
                    System.out.println(Thread.currentThread().getName() + "卖了一张票，还剩下" + ticket.getCount() + "张票。");
                } else {
                    System.out.println("对不起，已经没有票了。。。");
                    System.exit(0);
                    break out;
                }
            }
        }

    }
}
