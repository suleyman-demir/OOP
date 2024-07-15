package LinkedList;

public class State {
    private String status; // Durumun adını tutar
    private State nextState; // Bir sonraki durumu gösterir

    /**
     * Argümanlı yapıcı metot.
     * @param status Durumun adını ifade eder.
     */
    public State(String status) {
        this.status = status;
    }

    /**
     * Bir sonraki durumu ayarlar.
     * @param nextState Bir sonraki durum.
     */
    public void setNextState(State nextState) {
        this.nextState = nextState;
    }

    /**
     * Bir sonraki durumu döner.
     * @return nextState Bir sonraki durum.
     */
    public State getNextState() {
        return nextState;
    }

    /**
     * Durumun adını ekrana yazdırır.
     */
    public void yazdir() {
        System.out.println("Durum: " + status);
    }

    public static void main(String[] args) {
        // Durum nesneleri oluşturuluyor
        State open = new State("Open");
        State start = new State("Start");
        State stop = new State("Stop");
        State close = new State("Close");

        // Durumlar birbirine bağlanıyor
        open.setNextState(start);
        start.setNextState(stop);
        stop.setNextState(close);

        // İlk durumdan başlanarak tüm durumlar yazdırılıyor
        State currentState = open;
        while (currentState != null) {
            currentState.yazdir();
            currentState = currentState.getNextState();
        }
    }
}

