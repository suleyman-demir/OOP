package Inheritance2;

public class InheritanceInput {
    public static void main(String[] args) {
        InheritanceOgrenci ogrenci=new InheritanceOgrenci("Süleyman","Demir",21,12345678912L);
        ogrenci.setDonemNotu(67);
        ogrenci.setOkulNo(1243);
        ogrenci.setSinifSubesi("12-A");


        InheritanceOgretmen ogretmen=new InheritanceOgretmen("Ahmet","Yanaş",38,12345678812L);
        ogretmen.setMaas(43250);
        ogretmen.setBolumAdi("Bilgisayar Mühendisliği");
        ogretmen.setVerdigiDersler("İnternet Programcılığı , Görsel Programlama");

        InheritanceGorevli gorevli=new InheritanceGorevli("Yaşar","Taner",47,12223456789L);
        gorevli.setMaasGorevli(27000);
        gorevli.setGorevAlani("Bahçe");

        ogretmen.print();

        ogrenci.print();

        gorevli.print();
    }
}
