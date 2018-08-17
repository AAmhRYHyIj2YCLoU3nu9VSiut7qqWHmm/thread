package com.amin;

/**
 * is created by aMIN on 8/18/2018 at 1:14 AM
 */
public class J {
    public static void main(String[] args) {

        final M target = new M();
        Thread m = new Thread(target, "Abolfazl Ghahremani");
        Thread mm = new Thread(target, "niloofar talaie");

        m.start();
        mm.start();

    }
}

class M implements Runnable {


    static boolean ifi = true;

    @Override
    public synchronized void run() {
        for (int i = 0; i < 23; i++) {
            System.out.println(Thread.currentThread().getName());
            notify();
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("after for"+Thread.currentThread().getName());
        notify();



    }
}


