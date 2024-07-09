package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor{

    public static void main(String[] args) {
        ExecutorService tekHavuz = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 5; i++) {
            Runnable gorev = new Gorev("" + i);
            tekHavuz.execute(gorev);
        }

        tekHavuz.shutdown();
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