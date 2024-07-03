package InputOutput2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Ogrenci {
    String isim;
    String soyisim;
    int yas;
    String sinif;
    double ortalama;

    public Ogrenci(String isim, String soyisim, int yas, String sinif, double ortalama) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.sinif = sinif;
        this.ortalama = ortalama;
    }
}

public class OgrenciCSV {

    // Öğrenci bilgilerini CSV dosyasına yazan method
    public static void ogrencileriCSVYaz(List<Ogrenci> ogrenciler, String dosyaAdi) {
        try (BufferedWriter yazici = new BufferedWriter(new FileWriter(dosyaAdi))) {
            // Başlık satırını yaz
            yazici.write("isim,soyisim,yas,sınıf,ortalama\n");

            // Öğrenci bilgilerini yaz
            for (Ogrenci ogrenci : ogrenciler) {
                yazici.write(ogrenci.isim + "," + ogrenci.soyisim + "," + ogrenci.yas + "," + ogrenci.sinif + "," + ogrenci.ortalama);
                yazici.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // CSV dosyasını okuyup öğrencilerin bilgilerini ekrana yazan method
    public static void ogrencileriCSVdenOku(String dosyaAdi) {
        try (BufferedReader okuyucu = new BufferedReader(new FileReader(dosyaAdi))) {
            String satir;
            // İlk satırı (başlık satırı) atla
            okuyucu.readLine();

            // Öğrenci bilgilerini oku ve ekrana yaz
            while ((satir = okuyucu.readLine()) != null) {
                String[] veriler = satir.split(",");
                String isim = veriler[0];
                String soyisim = veriler[1];
                int yas = Integer.parseInt(veriler[2]);
                String sinif = veriler[3];
                double ortalama = Double.parseDouble(veriler[4]);
                System.out.println("İsim: " + isim + ", Soyisim: " + soyisim + ", Yaş: " + yas + ", Sınıf: " + sinif + ", Ortalama: " + ortalama);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // 10 öğrenci oluştur
        List<Ogrenci> ogrenciler = new ArrayList<>();
        ogrenciler.add(new Ogrenci("Ahmet", "Yılmaz", 15, "10-A", 85.5));
        ogrenciler.add(new Ogrenci("Ayşe", "Kara", 16, "11-B", 90.3));
        ogrenciler.add(new Ogrenci("Mehmet", "Demir", 14, "9-C", 78.2));
        ogrenciler.add(new Ogrenci("Fatma", "Çelik", 17, "12-A", 92.1));
        ogrenciler.add(new Ogrenci("Ali", "Şahin", 15, "10-B", 83.6));
        ogrenciler.add(new Ogrenci("Zeynep", "Ak", 16, "11-C", 87.4));
        ogrenciler.add(new Ogrenci("Hasan", "Koç", 14, "9-A", 80.9));
        ogrenciler.add(new Ogrenci("Emine", "Öz", 17, "12-B", 88.5));
        ogrenciler.add(new Ogrenci("Hüseyin", "Taş", 15, "10-C", 76.3));
        ogrenciler.add(new Ogrenci("Elif", "Kurt", 16, "11-A", 91.7));

        String dosyaAdi = "ogrenciler.csv";

        // Öğrenci bilgilerini CSV dosyasına yaz
        ogrencileriCSVYaz(ogrenciler, dosyaAdi);

        // CSV dosyasını okuyup öğrencilerin isim, soyisim, yaş, sınıf ve ortalama bilgilerini ekrana yaz
        ogrencileriCSVdenOku(dosyaAdi);
    }
}
