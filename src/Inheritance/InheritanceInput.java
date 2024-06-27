package Inheritance;

public class InheritanceInput {
    public static void main(String[] args) {
        InheritanceStudent ogrenci =new InheritanceStudent("Süleyman","Demir");


        ogrenci.setNotlar(12,45,76);
        ogrenci.setOkulNo(1243);
        ogrenci.setSinifSubesi("12-A");
        System.out.println(ogrenci.getAd()+" "+ogrenci.getSoyad()+" "+"\n"+ogrenci.getSinifSubesi()+" "+ ogrenci.getOkulNo()+ " "+ogrenci.getNot1()+" "+ogrenci.getNot2()+" "+ogrenci.getNot3());

    }


}
