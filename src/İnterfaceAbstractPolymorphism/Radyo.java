package İnterfaceAbstractPolymorphism;

public  class Radyo extends AbstractCihaz {

    public Radyo(String cihazTipi, String cihazModeli) {
        super(cihazTipi, cihazModeli);
    }

    @Override
    public void sesAc() {
        System.out.println("RAdyo Ses Açtı");
    }

}
