package İnterfaceAbstractPolymorphism;

public abstract class Radyo extends AbstractCihaz {

    public Radyo(String cihazTipi, String cihazModeli) {
        super(cihazTipi, cihazModeli);
    }
    public void sesAc() {
        System.out.println("Radyo Sesi Açıldı");
    }

}
class RadyoModel extends Radyo{
    public RadyoModel(String cihazTipi, String cihazModeli) {
        super(cihazTipi, cihazModeli);

    }

}
