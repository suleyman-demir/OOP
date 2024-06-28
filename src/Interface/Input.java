package Interface;

import Inheritance2.InheritanceGorevli;
import Inheritance2.InheritanceOgrenci;
import Inheritance2.InheritanceOgretmen;

    public class Input {
        public static void main(String[] args) {
            InterfaceOgrenci ogrenci = new InterfaceOgrenci("Süleyman", "Demir", 21, 12345678912L);
            ogrenci.setDonemNotu(67);
            ogrenci.setOkulNo(1243);
            ogrenci.setSinifSubesi("12-A");

            InterfaceOgretmen ogretmen = new InterfaceOgretmen("Ahmet", "Yanaş", 38, 12345678812L);
            ogretmen.setMaas(43250);
            ogretmen.setBolumAdi("Bilgisayar Mühendisliği");
            ogretmen.setVerdigiDersler("İnternet Programcılığı, Görsel Programlama");

            InterfaceGorevli gorevli = new InterfaceGorevli("Yaşar", "Taner", 47, 12223456789L);
            gorevli.setMaasGorevli(27000);
            gorevli.setGorevAlani("Bahçe");

            System.out.println(gorevli.getFullName() + " " + "\n" + gorevli.getDetails() + "\n");
            System.out.println(ogrenci.getFullName() + " " + "\n" + ogrenci.getDetails() + "\n");
            System.out.println(ogretmen.getFullName() + " " + "\n" + ogretmen.getDetails() + "\n");
        }
    }


