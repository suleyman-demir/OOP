package PolymOrnegi;

public abstract class Bmw extends AbstractArac {
    public Bmw(int motorGucu, String marka, String aracYazilimVersiyonu) {
        super(motorGucu, marka, aracYazilimVersiyonu);
    }

    public void openSunroof() {
        System.out.println("BMW sunroof açıldı");
    }

    public void closeSunroof() {
        System.out.println("BMW sunroof kapatıldı");
    }

    public void onNeon() {
        System.out.println("BMW neon ışıkları açıldı");
    }

    public void offNeon() {
        System.out.println("BMW neon ışıkları kapatıldı");
    }
}
