package PolymOrnegi;

public abstract class AbstractArac implements Arac {
    protected int motorGucu;
    protected String marka;
    private final String aracYazilimVersiyonu;

    public AbstractArac(int motorGucu, String marka, String aracYazilimVersiyonu) {
        this.motorGucu = motorGucu;
        this.marka = marka;
        this.aracYazilimVersiyonu = aracYazilimVersiyonu;
    }

    @Override
    public void kontakCalistir() {
        System.out.println("Araba çalıştı");
    }

    protected String getAracYazilimVersiyonu() {
        return aracYazilimVersiyonu;
    }
}

