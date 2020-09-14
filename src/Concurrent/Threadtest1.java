package Concurrent;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Threadtest1 {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new Mythread1(1));
        Thread t2 = new Thread(new Mythread1(2));
        Thread t3 = new Thread(new Mythread1(3));
        Thread t4 = new Thread(new Mythread1(4));
        t1.start();
//        t2.join();
        t2.start();
//        t1.sleep(100);
//        t2.sleep(500);
        t3.start();
        t4.start();
//        ThreadPoolExecutor executor = new ThreadPoolExecutor();
//        executor.execute();
        System.out.println(TimeUnit.SECONDS );
    }
}
