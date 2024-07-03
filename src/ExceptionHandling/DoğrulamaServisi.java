package ExceptionHandling;

import java.util.logging.Logger;

public class DoğrulamaServisi {
    private static final Logger loglayici = Logger.getLogger(DoğrulamaServisi.class.getName());

    public void doğrula(int sayı) {
        try {
            if (sayı < 0) {
                throw new NotValidException("girilen sayı negatif");
            }
        } finally {
            System.out.println("işlem tamamlandı");
        }
    }

    public static void main(String[] args) {
        DoğrulamaServisi doğrulamaServisi = new DoğrulamaServisi();

        try {
            doğrulamaServisi.doğrula(5);  // Pozitif durum
            doğrulamaServisi.doğrula(-3); // Negatif durum
        } catch (NotValidException e) {
            loglayici.info(e.getMessage());
        }
    }
}
