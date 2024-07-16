package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamEmplyoeeExample {
    private String ad;
    private int yas;
    private String departman;
    private int maas;

    public StreamEmplyoeeExample(String ad, int yas, String departman, int maas){
        this.ad=ad;
        this.yas=yas;
        this.departman=departman;
        this.maas=maas;

    }
    public String getAd(){
        return ad;
    }
    public int getYas(){
        return yas;
    }
    public String getDepartman(){
        return departman;
    }
    public int getMaas(){
        return maas;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String toString(){
        return "Eleman [ "+" Ad Soyad : " +ad+" Yaş : "+yas+ " Departman : "+departman+" Maaş : "+maas+" ] ";
    }

    public static void main(String[] args) {
        StreamEmplyoeeExample calisan1=new StreamEmplyoeeExample("Ahmet Demir",24,"IT",42500);
        StreamEmplyoeeExample calisan2=new StreamEmplyoeeExample("Ayşe Yılmaz", 30, "IT", 50000);
        StreamEmplyoeeExample calisan3=new StreamEmplyoeeExample("Mehmet Çelik", 35, "Mühendislik", 60000);
        StreamEmplyoeeExample calisan4=new StreamEmplyoeeExample("Fatma Korkmaz", 28, "İnsan Kaynakları", 45000);
        StreamEmplyoeeExample calisan5=new StreamEmplyoeeExample("Ali Özkan", 40, "Finans", 70000);

        List<StreamEmplyoeeExample> calisanListe=new ArrayList<>();
        calisanListe.add(calisan1);
        calisanListe.add(calisan2);
        calisanListe.add(calisan3);
        calisanListe.add(calisan4);
        calisanListe.add(calisan5);

        System.out.println("IT DEPARTMANI ÇALIŞANLARI\n");
        calisanListe.stream()
                .filter(calisan ->calisan.departman.equals("IT"))
                .collect(Collectors.toList()).forEach(System.out::println);

        Double ortalamaMaas= calisanListe.stream()
                .filter(calisan -> calisan.yas>=30).mapToDouble(StreamEmplyoeeExample::getMaas).average().getAsDouble();
        System.out.println("\n30 ve üzeri yaş için ortalama maaş  :  "+ortalamaMaas.intValue());



        System.out.println("En yüksek Maaş : "+calisanListe.stream().
                max(Comparator.comparingDouble(StreamEmplyoeeExample::getMaas))
                .map(StreamEmplyoeeExample::getMaas)
                .get().intValue());

        System.out.println("IT DEPARTMANI ÇALIŞAN SAYISI : "+calisanListe.stream().filter(calisan->calisan.departman.equals("IT")).collect(Collectors.toList()).size());
        System.out.println("IT DEPARTMANI ÇALIŞAN SAYISI : "+calisanListe.stream().filter(calisan->calisan.departman.equals("IT")).count());
        System.out.println("MÜHENDİSLİK DEPARTMANI ÇALIŞAN SAYISI : "+calisanListe.stream().filter(calisan->calisan.departman.equals("Mühendislik")).collect(Collectors.toList()).size());
        System.out.println("İNSAN KAYNAKLARI DEPARTMANI ÇALIŞAN SAYISI : "+calisanListe.stream().filter(calisan->calisan.departman.equals("İnsan Kaynakları")).collect(Collectors.toList()).size());


        Map<String, Long> departmanCalisanSayisi=calisanListe.stream()
                .collect(Collectors.groupingBy(StreamEmplyoeeExample::getDepartman,Collectors.counting()));


       /* Map<String,List<StreamEmplyoeeExample>> ornek3=calisanListe.stream()
                .collect(Collectors.groupingBy(StreamEmplyoeeExample::getDepartman)); */




        departmanCalisanSayisi.forEach((departman,sayi)-> System.out.println(departman+"  :  "+sayi));











    }

}
