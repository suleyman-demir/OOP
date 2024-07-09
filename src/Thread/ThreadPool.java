package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService executorum = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            Runnable gorev= new Gorev(" "+i);
            executorum.execute(gorev);

        }
        executorum.shutdown();
        while (!executorum.isTerminated()) {

        }
        System.out.println("Bütün Gçrevler Tamamlandı...");

    }
   static class Gorev implements Runnable{
            private String name;
    public Gorev(String name) {
        this.name = name;
    }

       @Override
       public void run() {
           System.out.println("Görev " + name + " iş parçacığı: " + Thread.currentThread().getName());
           try {
               Thread.sleep(2000);

           }catch (InterruptedException e) {
               e.printStackTrace();
           }
           System.out.println("Görev " + name + " tamamlandı");

       }
   }
}
