package İnterfaceAbstractPolymorphism;

public class Main {
    public static void main(String[] args) {
        Interface tv = new TelevizyonModel("Televizyon", "Philips-FDR543");
        tv.openClose();
        ((TelevizyonModel) tv).sesAc();

        Interface radyom = new RadyoModel("Radyo", "Pioneer-CSD44");
        radyom.openClose();
        ((RadyoModel) radyom).sesAc();

        Interface hoparlorum =new HoparlorModel("Hoparlor", "Samsung-SSHP209");
        hoparlorum.openClose();
        ((HoparlorModel) hoparlorum).sesAc();

    }
}