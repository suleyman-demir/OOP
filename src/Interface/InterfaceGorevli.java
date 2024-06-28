package Interface;

public class InterfaceGorevli implements InterfaceSinifi {
        private final String ad;
        private final String soyad;
        private final int yas;
        private final Long tcNo;
        private String gorevAlani;
        private int maasGorevli;

        public InterfaceGorevli(String ad, String soyad, int yas, Long tcNo) {
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

        public void setGorevAlani(String gorevAlani) {
            this.gorevAlani = gorevAlani;
        }

        public void setMaasGorevli(int maasGorevli) {
            this.maasGorevli = maasGorevli;
        }

        public String getGorevAlani() {
            return gorevAlani;
        }

        public int getMaasGorevli() {
            return maasGorevli;
        }

        @Override
        public String getFullName() {
            return "Ad : " + ad + " Soyad : " + soyad;
        }

        @Override
        public String getDetails() {
            return "TC Kimlik Numarası : " + tcNo + "\n" + "Yaş : " + yas + "\n" + "Görev Alanı: " + gorevAlani
                    + "\n" + "Maaş : " + maasGorevli + "\n";
        }

        public void print() {
            System.out.println("Ad Soyad: " + ad + " " + soyad + "\n" +
                    "TC Kimlik Numarası : " + tcNo + "\n" +
                    "Yaş : " + yas + "\n" +
                    "Görev Alanı: " + gorevAlani + "\n" +
                    "Maaş : " + maasGorevli + "\n");
        }
    }


