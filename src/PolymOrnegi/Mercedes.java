package PolymOrnegi;

public abstract class Mercedes extends AbstractArac {
    public Mercedes(int motorGucu, String marka, String aracYazilimVersiyonu) {
        super(motorGucu, marka, aracYazilimVersiyonu);
    }

    public void openSunroof() {
        System.out.println("Mercedes sunroof açıldı");
    }

    public void closeSunroof() {
        System.out.println("Mercedes sunroof kapatıldı");
    }
}
