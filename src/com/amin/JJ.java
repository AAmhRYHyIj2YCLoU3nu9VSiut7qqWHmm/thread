package com.amin;

import static com.amin.M.ifi;

/**
 * is created by aMIN on 8/18/2018 at 1:41 AM
 */
public class JJ implements Runnable {
    @Override
    public void run() {
        synchronized (this) {

            try {
                System.out.println(Thread.currentThread().getName());
                if (ifi){
                    wait();
                }
                System.out.println("after wait");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }


    public static void main(String[] args) throws InterruptedException {
        final JJ target = new JJ();
        new Thread(target, "GOD").start();
        new Thread(target, "GOD1").start();
        new Thread(target, "GOD2").start();
        new Thread(target, "GOD3").start();
        System.out.println("after all thread");
        Thread.sleep(23232);
        synchronized (target){
            System.out.println("in tar");
            target.notifyAll();
            System.out.println("aft notify all");
        }

    }

}




