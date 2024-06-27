package Inheritance2;

public class InheritanceOgretmen extends InheritanceGenel{
    public InheritanceOgretmen(String ad, String soyad, int yas, Long tcNo) {
        super(ad, soyad, yas, tcNo);
    }
    public String bolumAdi;
    public String verdigiDersler;
    public int maas;

    public void setBolumAdi(String bolumAdi) {
        this.bolumAdi = bolumAdi;
    }
    public void setVerdigiDersler(String verdigiDersler) {
        this.verdigiDersler = verdigiDersler;

    }
    public void setMaas(int maas) {
        this.maas = maas;
    }
    public String getBolumAdi() {
        return bolumAdi;
    }
    public String getVerdigiDersler() {
        return verdigiDersler;
    }
    public int getMaas() {
        return maas;
    }
    public void print(){
        System.out.println("Ad Soyad: "+ad+" "+soyad+"\n"+"TC Kimlik Numarası : "+tcNo+"\n"+"Yaş : " +yas+"\n" +"Bolum Adi: " + bolumAdi
        + "\n"+"Maaş : "+maas+"\n"+"Verdiği Dersler : "+verdigiDersler+"\n");
    }
}
