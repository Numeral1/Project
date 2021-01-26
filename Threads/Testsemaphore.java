package by.alex.Threads;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Testsemaphore extends Thread {
    private int number;
    private Semaphore semaphore;
    private String name;

    public Testsemaphore(int number, Semaphore semaphore, String name) {
        this.number = number;
        this.semaphore = semaphore;
        this.name = name;
    }
    @Override
    public void run() {
        try {
            System.out.println("Came Thread ->" + this.name);
            semaphore.acquire();
//            TimeUnit.SECONDS.sleep(1);
            for (int i = number; i <= number*number; i++) {
                System.out.println(this.name + ": " + i);
//                TimeUnit.SECONDS.sleep(1);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
            System.out.println("Thread - " + this.name + "Stop");
        }

    }

}
