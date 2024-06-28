package Interface;

public class InterfaceOgrenci implements InterfaceSinifi {
        private final String ad;
        private final String soyad;
        private final int yas;
        private final Long tcNo;
        private int okulNo;
        private String sinifSubesi;
        private int donemNotu;

        public InterfaceOgrenci(String ad, String soyad, int yas, Long tcNo) {
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

        public void setOkulNo(int okulNo) {
            this.okulNo = okulNo;
        }

        public void setSinifSubesi(String sinifSubesi) {
            this.sinifSubesi = sinifSubesi;
        }

        public void setDonemNotu(int donemNotu) {
            this.donemNotu = donemNotu;
        }

        public int getOkulNo() {
            return okulNo;
        }

        public String getSinifSubesi() {
            return sinifSubesi;
        }

        public int getDonemNotu() {
            return donemNotu;
        }

        @Override
        public String getFullName() {
            return "Ad Soyad: " + ad + " " + soyad;
        }

        @Override
        public String getDetails() {
            return "\n" + "TC Kimlik Numarası : " + tcNo + "\n" + "Yaş : " + yas + "\n" + "Okul Numarası : " + okulNo
                    + "\n" + "Sınıf Şubesi : " + sinifSubesi + "\n" + "Dönem Notu : " + donemNotu + "\n";
        }

        public void print() {
            System.out.println("Ad Soyad: " + ad + " " + soyad + "\n" + "TC Kimlik Numarası : " + tcNo + "\n" + "Yaş : " + yas + "\n" + "Okul Numarası : " + okulNo
                    + "\n" + "Sınıf Şubesi : " + sinifSubesi + "\n" + "Dönem Notu : " + donemNotu + "\n");
        }
    }


