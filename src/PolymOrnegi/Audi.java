package PolymOrnegi;

public abstract class Audi extends AbstractArac {
    public Audi(int motorGucu, String marka, String aracYazilimVersiyonu) {
        super(motorGucu, marka, aracYazilimVersiyonu);
    }

    public void onNeon() {
        System.out.println("Audi neon ışıkları açıldı");
    }

    public void offNeon() {
        System.out.println("Audi neon ışıkları kapatıldı");
    }
}
