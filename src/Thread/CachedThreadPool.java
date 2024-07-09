package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {

    public static void main(String[] args) {
        ExecutorService geciciHavuz = Executors.newCachedThreadPool();

        for (int i = 0; i < 5; i++) {
            Runnable gorev = new Gorev(" "+ i);
            geciciHavuz.execute(gorev);
        }

        geciciHavuz.shutdown();

    }
    static class Gorev implements Runnable {
        private String isim;

        public Gorev(String isim) {
            this.isim = isim;
        }

        @Override
        public void run() {
            System.out.println("Görev " + isim + " iş parçacığı: " + Thread.currentThread().getName());
        }
    }
}
