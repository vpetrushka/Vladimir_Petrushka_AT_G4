package tasks.classwork.day11;

public class WhatFirst {

    public static void main(String[] args) throws InterruptedException {

        Object lock = new Object();

        new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 3; i++) {

                    try {
                        Thread.currentThread().sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.printf("t1 - %s\r\n", i);
                }
            }
        }).start();

        Thread.sleep(1000);

        synchronized (lock) {
            for (int i = 0; i < 3; i++) {
                Thread.currentThread().sleep(1000);
                System.out.printf("m - %s\r\n", i);
            }
        }
    }
}
