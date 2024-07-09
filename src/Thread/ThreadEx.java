package Thread;

public class ThreadEx extends java.lang.Thread {
    public static void main(String[] args) {

        Thread t = new ThreadEx();
        Thread t2 = new ThreadEx();
        t.start();
        t2.start();
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+" - "+i);
        }
    }
}
