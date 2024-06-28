package Interface;

public class InterfaceOgretmen implements InterfaceSinifi{
        private final String ad;
        private final String soyad;
        private final int yas;
        private final Long tcNo;
        private String bolumAdi;
        private String verdigiDersler;
        private int maas;

        public InterfaceOgretmen(String ad, String soyad, int yas, Long tcNo) {
            this.ad = ad;
            this.soyad = soyad;
            this.yas = yas;
            this.tcNo = tcNo;
        }

        @Override
        public String getAd() {
            return ad;
        }

        @Override
        public String getSoyad() {
            return soyad;
        }

        @Override
        public int getYas() {
            return yas;
        }

        @Override
        public Long getTcNo() {
            return tcNo;
        }

        public void setBolumAdi(String bolumAdi) {
            this.bolumAdi = bolumAdi;
        }

        public void setVerdigiDersler(String verdigiDersler) {
            this.verdigiDersler = verdigiDersler;
        }

        public void setMaas(int maas) {
            this.maas = maas;
        }

        public String getBolumAdi() {
            return bolumAdi;
        }

        public String getVerdigiDersler() {
            return verdigiDersler;
        }

        public int getMaas() {
            return maas;
        }

        @Override
        public String getFullName() {
            return "Ad Soyad: " + ad + " " + soyad;
        }

        @Override
        public String getDetails() {
            return "\n" + "TC Kimlik Numarası : " + tcNo + "\n" + "Yaş : " + yas + "\n" + "Bolum Adi: " + bolumAdi
                    + "\n" + "Maaş : " + maas + "\n" + "Verdiği Dersler : " + verdigiDersler + "\n";
        }

        public void print() {
            System.out.println("Ad Soyad: " + ad + " " + soyad + "\n" + "TC Kimlik Numarası : " + tcNo + "\n" + "Yaş : " + yas + "\n" + "Bolum Adi: " + bolumAdi
                    + "\n" + "Maaş : " + maas + "\n" + "Verdiği Dersler : " + verdigiDersler + "\n");
        }
    }


