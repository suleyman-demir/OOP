package İnterfaceAbstractPolymorphism;

public abstract class AbstractCihaz  {
public String cihazTipi;
public String cihazModeli;

public AbstractCihaz(String cihazTipi, String cihazModeli) {
    this.cihazTipi = cihazTipi;
    this.cihazModeli = cihazModeli;

}
    public  void openClose() {
    System.out.println("Cihaz " + cihazTipi + " " +"\nCihaz Modeli : "+ cihazModeli+"Cihaz Çalıştı... " );
}

    public abstract void sesAc();




}