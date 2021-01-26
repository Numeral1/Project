package by.alex.Threads;

import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class runner {
    public static void main(String[] args) {
//        Test test = new Test();
//        Thread thread = new Thread(test);
//        MyThread myThread = new MyThread();
//        thread.setName("Поток 1");
//        myThread.setName("Поток 2");
//        thread.start();
//        myThread.start();
//        MyThread myThread1= new MyThread();
//        Thread thread1 = new Thread(test);
//        myThread1.setName("Поток 3");
//        thread1.setName("Поток 4");
//        myThread1.start();
//        thread1.start();
        System.out.println("===========================");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of iterations");
        int numberOfThreads = scanner.nextInt();
        System.out.println("Enter quantity of permits ");
        int numberOfPermits = scanner.nextInt();

        Semaphore semaphore = new Semaphore(numberOfPermits,true);

        new Testsemaphore(numberOfThreads,semaphore,"Thread-1").start();
        new Testsemaphore(numberOfThreads,semaphore,"Thread-2").start();
        new Testsemaphore(numberOfThreads,semaphore,"Thread-3").start();
        new Testsemaphore(numberOfThreads,semaphore,"Thread-4").start();
        new Testsemaphore(numberOfThreads,semaphore,"Thread-5").start();
        new Testsemaphore(numberOfThreads,semaphore,"Thread-6").start();
        new Testsemaphore(numberOfThreads,semaphore,"Thread-7").start();
        new Testsemaphore(numberOfThreads,semaphore,"Thread-8").start();
        new Testsemaphore(numberOfThreads,semaphore,"Thread-9").start();
        new Testsemaphore(numberOfThreads,semaphore,"Thread-10").start();



//        Thread t1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("t1 start!");
//                for (int i = 0; i < 5; i++){
//                    System.out.println(Thread.currentThread().getName() + i +"-t1");
//                }
//                System.out.println("t1 stop");
//            }
//        });
//        t1.start();

    }
}
