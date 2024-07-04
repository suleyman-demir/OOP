package İnterfaceAbstractPolymorphism;

public abstract class AbstractCihaz implements Interface  {
public String cihazTipi;
public String cihazModeli;

public AbstractCihaz(String cihazTipi, String cihazModeli) {
    this.cihazTipi = cihazTipi;
    this.cihazModeli = cihazModeli;

}
    public void openClose() {
    System.out.println("Cihaz " + cihazTipi + " " +"\nCihaz Modeli : "+ cihazModeli+"Cihaz Çalıştı... " );
}

    public void sesAc(){
        System.out.println("Cihaz " + cihazTipi + " " +"\nCihaz Modeli : "+ cihazModeli+"Cihaz Sesi Açıldı... " );
    }




}