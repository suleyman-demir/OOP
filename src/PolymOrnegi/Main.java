package PolymOrnegi;

public class Main {
    public static void main(String[] args) {
        Arac bmw = new BmwModel(300, "BMW", "v1.0.0");
        bmw.kontakCalistir();
        ((Bmw)bmw).openSunroof();
        ((Bmw)bmw).onNeon();

        Arac mercedes = new MercedesModel(250, "Mercedes", "v1.0.0");
        mercedes.kontakCalistir();
        ((Mercedes)mercedes).openSunroof();

        Arac audi = new AudiModel(280, "Audi", "v1.0.0");
        audi.kontakCalistir();
        ((Audi)audi).onNeon();
    }
}
