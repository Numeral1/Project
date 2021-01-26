package by.alex.Threads;

public class Test implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++){
            System.out.println(Thread.currentThread().getName() + " countTest " + i);
        }
        System.out.println(Thread.currentThread().getName() + " Test stop");
    }
}
