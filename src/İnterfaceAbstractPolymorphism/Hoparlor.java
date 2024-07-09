package İnterfaceAbstractPolymorphism;

public class Hoparlor extends AbstractCihaz {
    public Hoparlor(String cihazTipi, String cihazModeli) {
        super(cihazTipi, cihazModeli);
    }
    public void sesAc(){
        System.out.println("Hoparlör Sesi Açıldı");
    }

}

