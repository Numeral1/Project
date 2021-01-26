package by.alex.Threads;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class MyThread extends Thread {

    @Override
    public void run() {
        try{
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e){
            e.getMessage();
        }

        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName() +" "+ i);
        }
        System.out.println(Thread.currentThread() + " MyThread stop");
    }
}
