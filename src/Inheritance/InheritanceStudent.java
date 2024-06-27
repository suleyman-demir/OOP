package Inheritance;

public class InheritanceStudent extends InheritanceClass{
    public InheritanceStudent(String ad, String soyad) {
        super(ad, soyad);
    }

    public int okulNo;
    public String sinifSubesi;
    public int not1;
    public int not2;
    public int not3;

    public int getOkulNo(){
        return okulNo;
    }
    public void setOkulNo(int okulNo){
         this.okulNo = okulNo;

    }
    public String getSinifSubesi(){
        return sinifSubesi;
    }
    public void setSinifSubesi(String sinifSubesi){
        this.sinifSubesi = sinifSubesi;

    }
    public int getNot1(){
        return not1;
    }
    public void setNot1(int not1){
        this.not1 = not1;
    }
    public int getNot2(){
        return not2;

    }
    public void setNot2(int not2){
        this.not2 = not2;
    }
    public int getNot3(){
        return not3;
    }
    public void setNot3(int not3){
        this.not3 = not3;

    }

    public void setNotlar(int not1) {
        setNot1(not1);
    }

    public void setNotlar(int not1, int not2) {
        setNot1(not1);
        setNot2(not2);
    }
    public void setNotlar(int not1, int not2, int not3) {
        setNot1(not1);
        setNot2(not2);
        setNot3(not3);
    }
    public void getNotlar(int not1, int not2, int not3){


    }
}
