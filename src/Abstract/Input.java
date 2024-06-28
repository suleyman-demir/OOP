package Abstract;

import Inheritance2.InheritanceGorevli;
import Inheritance2.InheritanceOgrenci;
import Inheritance2.InheritanceOgretmen;

public class Input {public static void main(String[] args) {
    Ogrenci ogrenci=new Ogrenci("Süleyman","Demir",21,12345678912L);
    ogrenci.setDonemNotu(67);
    ogrenci.setOkulNo(1243);
    ogrenci.setSinifSubesi("12-A");


    Ogretmen ogretmen=new Ogretmen("Ahmet","Yanaş",38,12345678812L);
    ogretmen.setMaas(43250);
    ogretmen.setBolumAdi("Bilgisayar Mühendisliği");
    ogretmen.setVerdigiDersler("İnternet Programcılığı , Görsel Programlama");

    Gorevli gorevli=new Gorevli("Yaşar","Taner",47,12223456789L);
    gorevli.setMaasGorevli(27000);
    gorevli.setGorevAlani("Bahçe");

    System.out.println(gorevli.getFullName()+" "+"\n"+gorevli.getDetails()+"\n" );

    System.out.println(ogrenci.getFullName()+" "+"\n"+ogrenci.getDetails()+"\n" );


    System.out.println(ogretmen.getFullName()+" "+"\n"+gorevli.getDetails()+"\n");

}
}
