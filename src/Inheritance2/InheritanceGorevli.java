package Inheritance2;

public class InheritanceGorevli extends InheritanceGenel{
    public InheritanceGorevli(String ad, String soyad, int yas, Long tcNo) {
        super(ad, soyad, yas, tcNo);
    }
    public String gorevAlani;
    public int maasGorevli;

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
    public void print(){
        System.out.println("Ad Soyad: "+ad+" "+soyad+"\n"+"TC Kimlik Numarası : "+tcNo+"\n"+"Yaş : " +yas+"\n" +"Görev Alanı: " + gorevAlani
                + "\n"+"Maaş : "+maasGorevli+"\n");
    }

}
