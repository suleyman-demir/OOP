package Thread;

public class SenkronizeSayac {
    private int sayac=0;

    public synchronized void arttir(){
        sayac++;
    }

    public synchronized int getSayac(){
        return sayac;
    }

    public static void main(String[] args) {

        SenkronizeSayac sayac1 = new SenkronizeSayac();
        Runnable gorev = () ->
        {
            for(int i=0; i<1000; i++){
                sayac1.arttir();

            }
        };
        Thread t1 = new Thread(gorev);
        Thread t2 = new Thread(gorev);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Son sayaç değeri : "+sayac1.getSayac());
    }
}
