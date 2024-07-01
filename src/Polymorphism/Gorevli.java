package Polymorphism;

public class Gorevli implements SimpleClass{
    private final String ad;
    private final String soyad;
    private final int yas;
    private final Long tcNo;
    private String gorevAlani;
    private int maasGorevli;

    public Gorevli(String ad, String soyad, int yas, Long tcNo) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.tcNo = tcNo;
    }

    public void setGorevAlani(String gorevAlani) {
        this.gorevAlani = gorevAlani;
    }

    public void setMaasGorevli(int maasGorevli) {
        this.maasGorevli = maasGorevli;
    }

    public String getGorevAlani() {
        return gorevAlani;
    }

    public int getMaasGorevli() {
        return maasGorevli;
    }

    public void print() {
        System.out.println("Ad Soyad: " + ad + " " + soyad + "\n" +
                "TC Kimlik Numarası : " + tcNo + "\n" +
                "Yaş : " + yas + "\n" +
                "Görev Alanı: " + gorevAlani + "\n" +
                "Maaş : " + maasGorevli + "\n");
    }

    @Override
    public String getAllInfo() {
        return "Ad Soyad: " + ad + " " + soyad+ "\nYaş ; " + yas + "\n Tc No: " + tcNo;
    }

    @Override
    public String getALLDetails() {
        return "Ad Soyad: " + ad + " " + soyad + "\n" +
                "TC Kimlik Numarası : " + tcNo + "\n" +
                "Yaş : " + yas + "\n" +
                "Görev Alanı: " + gorevAlani + "\n" +
                "Maaş : " + maasGorevli + "\n";
    }
}
