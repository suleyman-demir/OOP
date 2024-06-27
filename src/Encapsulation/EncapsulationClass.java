package Encapsulation;

public class EncapsulationClass {
    private String soyad;
    private String ad;

    public EncapsulationClass(String ad, String soyad) {
        this.ad=ad;
        this.soyad = soyad;
    }
    private void setAd(String ad) {
        this.ad = ad;
    }
    private void setSoyad(String soyad) {
        this.soyad = soyad;

    }
    public String getAd() {
        return ad;
    }
    public String getSoyad() {
        return soyad;
    }


}
