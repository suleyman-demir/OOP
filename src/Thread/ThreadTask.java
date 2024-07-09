package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTask {

    public static void main(String[] args) {
        ExecutorService sabitHavuz = Executors.newFixedThreadPool(10);

        for (int i = 1; i <= 100; i++) {
            int sayi = i;
            Runnable gorev = () -> {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Sayı: " + sayi + " Thread Bilgisi: " + Thread.currentThread().getName());
            };
            sabitHavuz.execute(gorev);
        }

        sabitHavuz.shutdown();
    }
}
