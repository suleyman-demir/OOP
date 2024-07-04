package İnterfaceAbstractPolymorphism;

public abstract class Hoparlor extends AbstractCihaz {
    public Hoparlor(String cihazTipi, String cihazModeli) {
        super(cihazTipi, cihazModeli);
    }
    public void sesAc(){
        System.out.println("Hoparlör Sesi Açıldı");
    }

}
class HoparlorModel extends Hoparlor{

    public HoparlorModel(String cihazTipi, String cihazModeli) {
        super(cihazTipi, cihazModeli);
    }
}
