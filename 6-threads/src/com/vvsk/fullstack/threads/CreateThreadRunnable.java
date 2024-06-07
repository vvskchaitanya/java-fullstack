package com.vvsk.fullstack.threads;

public class CreateThreadRunnable {

    public static void main(String args[]) {

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Runnable 1 started ");
                    Thread.sleep(300);
                    System.out.println("Runnable 1 again into running state");
                    for (int i = 1; i <= 5; i++) {
                        System.out.println("" + i);
                    }
                    System.out.println("Runnable 1 completed");
                } catch (InterruptedException e) {
                    System.out.println("Runnable 1 Interrupted");
                }

            }
        };

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Runnable 2 started ");
                    Thread.sleep(100);
                    System.out.println("Runnable 2 again into running state");
                    for (int i = 10; i <= 15; i++) {
                        Thread.sleep(50);
                        System.out.println("" + i);
                    }
                    System.out.println("Runnable 2 completed");
                } catch (InterruptedException e) {
                    System.out.println("Runnable 1 Interrupted");
                }
            }
        };

        Thread t1 = new Thread(runnable1, "Thread1");

        Thread t2 = new Thread(runnable2, "Thread2");

        t1.start();

        t2.start();

    }

}
