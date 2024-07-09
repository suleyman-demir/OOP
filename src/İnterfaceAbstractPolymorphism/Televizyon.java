package İnterfaceAbstractPolymorphism;

public class Televizyon extends AbstractCihaz{

    public Televizyon(String cihazTipi, String cihazModeli) {
        super(cihazTipi, cihazModeli);
    }

    @Override
    public void sesAc() {
        System.out.println("Televizyon Ses Açtı");
    }
}