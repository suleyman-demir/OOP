package Thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool{

    public static void main(String[] args) {
        ScheduledExecutorService zamanliHavuz = Executors.newScheduledThreadPool(2);

        Runnable gorev = new Gorev("zamanlı görev");

        // 5 saniye sonra çalıştır
        zamanliHavuz.schedule(gorev, 5, TimeUnit.SECONDS);

        // 2 saniye gecikme ile her 3 saniyede bir çalıştır
        zamanliHavuz.scheduleAtFixedRate(gorev, 2, 3, TimeUnit.SECONDS);

        // Havuzu kapatmak için bir süre bekleyin
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        zamanliHavuz.shutdown();
    }


    static class Gorev implements Runnable {
        private String isim;

        public Gorev(String isim) {
            this.isim = isim;
        }

        @Override
        public void run() {
            System.out.println("Görev " + isim + " thread: " + Thread.currentThread().getName());
        }
}}
