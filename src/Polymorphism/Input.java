package Polymorphism;


import Interface.InterfaceGorevli;

public class Input {
    public static void main(String[] args) {
        Ogrenci ogrenci=new Ogrenci("Süleyman","Demir",21,1234567890L);
        ogrenci.setDonemNotu(67);
        ogrenci.setOkulNo(1243);
        ogrenci.setSinifSubesi("12-A");

        Ogretmen ogretmen = new Ogretmen("Ahmet", "Yanaş", 38, 12345678812L);
        ogretmen.setMaas(43250);
        ogretmen.setBolumAdi("Bilgisayar Mühendisliği");
        ogretmen.setVerdigiDersler("İnternet Programcılığı, Görsel Programlama");

        Gorevli gorevli =new Gorevli("Yaşar", "Taner", 47, 12223456789L);
        gorevli.setMaasGorevli(27000);
        gorevli.setGorevAlani("Bahçe");

        info(ogretmen);
        info(ogrenci);
        info(gorevli);
    }

    public static void test(String[] args) {
        SimpleClass ogrenci=new Ogrenci("Süleyman","Demir",21,1234567890L);
        SimpleClass ogretmen = new Ogretmen("Ahmet", "Yanaş", 38, 12345678812L);
        SimpleClass gorevli =new Gorevli("Yaşar", "Taner", 47, 12223456789L);

        info(ogretmen);
        info(ogrenci);
        info(gorevli);
    }


    public static void info(SimpleClass n){
        System.out.println(n.getAllInfo());
        System.out.println(n.getALLDetails());
    }

}




