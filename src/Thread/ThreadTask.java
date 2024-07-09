package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadTask {
    public static AtomicInteger count =new AtomicInteger(0) ;

    public static void main(String[] args) {
        ExecutorService sabitHavuz = Executors.newFixedThreadPool(10);
        System.out.println("bAŞLADI");
        for (int i = 1; i <= 100; i++) {
            int sayi = i;
            Runnable gorev = () -> {
                try {
                    System.out.println(count.incrementAndGet());
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Sayı: " + sayi + " Thread Bilgisi: " + Thread.currentThread().getName());
            };
            sabitHavuz.execute(gorev);

        }
        sabitHavuz.shutdown();
        System.out.println("bitti");


    }
}
