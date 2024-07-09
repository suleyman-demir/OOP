package İnterfaceAbstractPolymorphism;

public class Main {
    public static void main(String[] args) {
        AbstractCihaz tv = new Televizyon("Televizyon", "Philips-FDR543");
        tv.openClose();
        tv.sesAc();

        AbstractCihaz radyom = new Radyo("Radyo", "Pioneer-CSD44");
        radyom.openClose();
        radyom.sesAc();

        AbstractCihaz hoparlorum =new Hoparlor("Hoparlor", "Samsung-SSHP209");
        hoparlorum.openClose();
        hoparlorum.sesAc();

    }
}