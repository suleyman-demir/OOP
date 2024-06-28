package Abstract;

public class Ogrenci extends AbstractSınıfı {
    public Ogrenci(String ad, String soyad, int yas, Long tcNo) {
        super(ad, soyad, yas, tcNo);

    }
    public int okulNo;
    public String sinifSubesi;
    public int donemNotu;

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }
    public void setSinifSubesi(String sinifSubesi) {
        this.sinifSubesi = sinifSubesi;
    }
    public void setDonemNotu(int donemNotu) {
        this.donemNotu = donemNotu;
    }

    public int getOkulNo(){
        return okulNo;
    }
    public String getSinifSubesi(){
        return sinifSubesi;
    }
    public int getDonemNotu(){
        return donemNotu;
    }


    @Override
    public String getFullName() {
        return "Ad Soyad: "+ad+" "+soyad;
    }

    @Override
    public String getDetails() {
        return "\n"+"TC Kimlik Numarası : "+tcNo+"\n"+"Yaş : " +yas+"\n" +"Okul Numarası : " + okulNo
                + "\n"+"Sınıf Şubesi : "+sinifSubesi+"\n"+"Dönem Notu : "+donemNotu+"\n";
    }
    public void print(){
        System.out.println("Ad Soyad: "+ad+" "+soyad+"\n"+"TC Kimlik Numarası : "+tcNo+"\n"+"Yaş : " +yas+"\n" +"Okul Numarası : " + okulNo
                + "\n"+"Sınıf Şubesi : "+sinifSubesi+"\n"+"Dönem Notu : "+donemNotu+"\n");
    }
}
