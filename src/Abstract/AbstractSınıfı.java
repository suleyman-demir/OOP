package Abstract;

public abstract class AbstractSınıfı {
    public final String ad;
    public final String soyad;
    public final int yas;
    public final Long tcNo;

    protected AbstractSınıfı(String ad, String soyad, int yas, Long tcNo) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.tcNo = tcNo;

    }
    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public int getYas() {
        return yas;
    }

    public Long getTcNo() {
        return tcNo;
    }
    public abstract String getFullName();

    public abstract String getDetails();
    }

