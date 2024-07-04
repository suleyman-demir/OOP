package İnterfaceAbstractPolymorphism;

public abstract class Televizyon extends AbstractCihaz{

    public Televizyon(String cihazTipi, String cihazModeli) {
        super(cihazTipi, cihazModeli);
    }

}
class TelevizyonModel extends Televizyon{
    public TelevizyonModel(String cihazTipi, String cihazModeli) {
        super(cihazTipi, cihazModeli);
    }
}