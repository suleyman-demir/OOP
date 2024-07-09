package Thread;

public class RunnableEx implements Runnable {
    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }

    public static void main(String[] args) {
        Thread isParcacigi1 = new Thread(new RunnableEx());
        Thread isParcacigi2 = new Thread(new RunnableEx());

        isParcacigi1.start();
        isParcacigi2.start();
    }
}